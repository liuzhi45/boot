package com.study.dao.repositry;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.study.dao.entity.Department;

@Repository
public interface DepartmentResposity extends JpaRepository<Department, Integer> {


}
