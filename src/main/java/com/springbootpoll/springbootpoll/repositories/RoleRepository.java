package com.springbootpoll.springbootpoll.repositories;



import com.springbootpoll.springbootpoll.model.Role;

import com.springbootpoll.springbootpoll.model.RoleName;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}