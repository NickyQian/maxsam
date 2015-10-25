package com.maxsam.dao.mapper;

import org.springframework.transaction.annotation.Transactional;

import com.maxsam.dao.AbstractMybatisMapper;
import com.maxsam.dao.entity.SamUser;

@Transactional
public interface UserDao extends AbstractMybatisMapper {
	public SamUser getUser(int userId);
	public SamUser getUserByName(String username);
	public String getUserName(int userId);
}
