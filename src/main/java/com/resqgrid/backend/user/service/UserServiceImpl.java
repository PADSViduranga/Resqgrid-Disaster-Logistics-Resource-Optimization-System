package com.resqgrid.backend.user.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.resqgrid.backend.user.dto.RegisterRequest;
import com.resqgrid.backend.user.entity.Role;
import com.resqgrid.backend.user.entity.Users;
import com.resqgrid.backend.user.repository.RoleRepository;
import com.resqgrid.backend.user.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository,
            PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    @Transactional
    public Users registerUser(RegisterRequest request) {
        if (userRepository.existsByEmail(request.getEmail())) {
            throw new IllegalArgumentException(
                    "Email already exists");
        }

        Role defaultRole = roleRepository.findByName("USER")
                .orElseThrow(() -> new IllegalArgumentException(
                        "Default role not found"));

        Users newUser = new Users();
        newUser.setFullName(request.getFullName());
        newUser.setEmail(request.getEmail());
        newUser.setPassword(
                passwordEncoder.encode(
                        request.getPassword()));

        newUser.setRole(defaultRole);
        return userRepository.save(newUser);
    }

}