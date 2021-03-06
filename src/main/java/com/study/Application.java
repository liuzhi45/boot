package com.study;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.study.dao.entity.Department;
import com.study.dao.entity.Role;
import com.study.dao.entity.User;
import com.study.dao.repositry.DepartmentResposity;
import com.study.dao.repositry.RoleReposity;
import com.study.dao.repositry.UserReposity;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@RestController
public class Application {
    
	@Autowired
	UserReposity user;
	
	@Autowired
	DepartmentResposity department;
	
	@Autowired
	RoleReposity role;
	
	@RequestMapping("/")
	@ResponseBody
	public Object home(){
		
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
		users.setRole(roles);
		user.save(users);
		return users;
	}
	
	@RequestMapping("/login")
	@ResponseBody
	public String login(@RequestParam("name") String name,@RequestParam("pass") String pass){
		
		return "success";
	}
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
