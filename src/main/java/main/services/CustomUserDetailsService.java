package main.services;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // For simplicity, we're using a hardcoded user. In a real application, you would fetch user details from a database.
        if ("user".equals(username)) {
            return new User("user", "{noop}password", new ArrayList<>());
        } else {
            throw new UsernameNotFoundException("User not found");
        }
    }
}