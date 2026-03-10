package com.example.da_tantaydo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.da_tantaydo.model.entity.Role;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
