package com.resqgrid.backend.user.service;

import java.util.List;

import com.resqgrid.backend.user.entity.Role;

public interface RoleService {
 
    List<Role> getAllRoles();

    Role getRoleById(Long id);
    // Define methods for role-related operations
}