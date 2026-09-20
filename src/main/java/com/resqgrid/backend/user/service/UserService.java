package com.resqgrid.backend.user.service;

import com.resqgrid.backend.user.dto.RegisterRequest;
import com.resqgrid.backend.user.dto.RegisterResponse;

public interface UserService{

    RegisterResponse registerUser(RegisterRequest registerRequest);
}