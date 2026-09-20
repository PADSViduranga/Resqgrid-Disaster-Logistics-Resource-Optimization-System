package com.resqgrid.backend.user.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.resqgrid.backend.user.entity.Role;

@Repository 

public interface RoleRepository extends JpaRepository<Role,Long>{

    Optional<Role> findByName(String name);

    boolean existsByName(String name);
}