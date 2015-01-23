package com.maxsam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maxsam.dao.UserDao;
import com.maxsam.dao.entity.SamUser;

@Service
public class UserLoginService {
	@Autowired
	private UserDao userDao;

	public SamUser getLoginUser(int userId) {
		return userDao.getUserName(userId);
	}
}
