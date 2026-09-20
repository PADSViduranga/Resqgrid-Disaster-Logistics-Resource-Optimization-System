package com.resqgrid.backend.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;

import com.resqgrid.backend.user.service.RoleService;
import com.resqgrid.backend.user.entity.Role;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/roles")

public class RoleController{

    private final RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping
    public ResponseEntity<List<Role>> getAllRoles(){
        List<Role> roles = roleService.getAllRoles();
        return ResponseEntity.ok(roles);
    }
    @GetMapping("/{id}")
        public ResponseEntity<Role> getRoleById(
            @PathVariable Long id
        ){

        Role role = roleService.getRoleById(id);
      
        return ResponseEntity.ok(role);

    }
    
}