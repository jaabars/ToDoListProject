package com.example.todolistproject.dao;

import com.example.todolistproject.model.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepo extends JpaRepository<Role, Long> {

    //@Query("SELECT r FROM Role r WHERE r.name=?1")
    Role findByName(String name);
}
