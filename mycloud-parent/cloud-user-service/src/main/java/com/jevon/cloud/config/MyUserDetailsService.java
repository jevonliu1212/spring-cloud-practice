//package com.jevon.cloud.config;
//
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Component
//public class MyUserDetailsService implements UserDetailsService {
//
//    @Override
//    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
//        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
//        SimpleGrantedAuthority simpleGrantedAuthority = new SimpleGrantedAuthority("ADMIN");
//        authorities.add(simpleGrantedAuthority);
//        User user  = new User("jevon",new BCryptPasswordEncoder().encode("111111"),authorities);
//        return user;
//    }
//}
