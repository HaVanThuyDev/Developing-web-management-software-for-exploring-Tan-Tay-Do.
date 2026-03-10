package com.example.da_tantaydo.service;

import com.example.da_tantaydo.model.entity.User;
import com.example.da_tantaydo.model.reponse.LoginReponseDTO;
import com.example.da_tantaydo.model.request.LoginRequestDto;
import com.example.da_tantaydo.model.request.RegisterRequestDTO;

public interface UserService {
    LoginReponseDTO login (LoginRequestDto request);
    User register (RegisterRequestDTO request);
}
