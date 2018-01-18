package com.mk.mkedu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.mk.mkedu.model.User;
import com.mk.mkedu.repo.UserRepository;
import com.mk.mkedu.repo.UserRolesRepository;
import com.mk.mkedu.security.CustomUserDetails;

@Service("customUserDetailsService")
@ComponentScan(basePackages = "com.mk.mkedu")
public class CustomUserDetailsService implements UserDetailsService
{
    private final UserRepository userRepository;
    private final UserRolesRepository userRolesRepository;

    @Autowired
    public CustomUserDetailsService(UserRepository userRepository, UserRolesRepository userRolesRepository)
    {
        this.userRepository = userRepository;
        this.userRolesRepository = userRolesRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
    {
        User user = userRepository.findByUserName(username);
        if (null == user)
        {
            throw new UsernameNotFoundException("No user present with username: " + username);
        } else
        {
            List<String> userRoles = userRolesRepository.findRoleByUserName(username);
            return new CustomUserDetails(user, userRoles);

        }
    }

}
