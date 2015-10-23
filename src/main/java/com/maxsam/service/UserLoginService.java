package com.maxsam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maxsam.dao.entity.SamUser;
import com.maxsam.dao.mapper.UserDao;

@Service
public class UserLoginService {
	@Autowired
	private UserDao userDao;

	public SamUser getLoginUser(int userId) {
		return userDao.getUser(userId);
	}

	public SamUser findUserByName(String name) {
		return userDao.getUser(name);
	}
}
