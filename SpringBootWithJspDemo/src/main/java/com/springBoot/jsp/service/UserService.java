package com.springBoot.jsp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBoot.jsp.repo.UserDao;

@Service
public class UserService {
	@Autowired
	UserDao dao;
	
	public String saveUser() {
		boolean f = dao.save();
		if(f) {
			return "Registration successfull";
		}
		else {
			return "server error";
		}
	}
}
