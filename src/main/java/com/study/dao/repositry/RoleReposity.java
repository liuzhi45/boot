package com.study.dao.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.study.dao.entity.Role;

@Repository
public interface RoleReposity extends JpaRepository<Role, Integer> {

}
