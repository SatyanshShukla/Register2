package com.cognizant.Service;

import com.cognizant.model.User;

import org.springframework.beans.factory.annotation.Autowired;

import com.cognizant.dao.*;

public class UserServiceImpl  implements UserService{
	@Autowired
UserDAO userDAO;
	public int register(User user) {
		
		
		return  userDAO.register(user);
	}

}
