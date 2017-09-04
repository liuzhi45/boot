package com.study;


import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.study.dao.entity.Department;
import com.study.dao.entity.Role;
import com.study.dao.entity.User;
import com.study.dao.repositry.DepartmentResposity;
import com.study.dao.repositry.RoleReposity;
import com.study.dao.repositry.UserReposity;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config.class)
public class MysqlTest {

	@Autowired
	UserReposity user;
	
	@Autowired
	DepartmentResposity department;
	
	@Autowired
	RoleReposity role;
	
	@Before
	public void initData(){
		
		Department departments  = new Department();
		departments.setName("开发部");
		department.save(departments);
		
		Role roles = new Role();
		roles.setName("admin");
		role.save(roles);
		
		User users = new User();
		users.setName("user");
		users.setCreateDate(new Date());
		users.setDepartment(departments);
		user.save(users);
	}
	
	@Test
	public void bootTest(){
		List<User> findAll = user.findAll();
		System.err.println(findAll);
	}
}
