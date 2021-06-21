package com.aashutosh.GrowAgroLogIn.service;

import com.aashutosh.GrowAgroLogIn.web.dto.UserRegistrationDto;
import com.aashutosh.GrowAgroLogIn.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User save(UserRegistrationDto registrationDto);

}
