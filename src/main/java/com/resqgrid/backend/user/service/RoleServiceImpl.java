package com.resqgrid.backend.user.service;

import java.util.List;

import com.resqgrid.backend.common.exception.ResourceNotFoundException;
import com.resqgrid.backend.user.entity.Role;

import org.springframework.stereotype.Service;

import com.resqgrid.backend.user.repository.RoleRepository;

@Service 
public class RoleServiceImpl implements RoleService {
    
    private final RoleRepository roleRepository;
    
    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public List<Role> getAllRoles(){
        return roleRepository.findAll();
    }  
    
    @Override 
    public Role getRoleById(Long id){
        return roleRepository.findById(id)
                .orElseThrow(() -> 
                new ResourceNotFoundException(
                    "Role not found with ID: " + id
                    ));
    }// Implement the methods defined in the RoleService interface
}   