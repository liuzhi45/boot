package com.study.dao.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.study.dao.entity.User;

@Repository
public interface UserReposity extends JpaRepository<User, Integer> {

}
