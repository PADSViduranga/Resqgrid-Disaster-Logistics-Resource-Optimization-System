package com.resqgrid.backend.user.service;

import com.resqgrid.backend.user.dto.RegisterRequest;
import com.resqgrid.backend.user.entity.Users;

public interface UserService{
    Users registerUser(RegisterRequest registerRequest);
}