package com.maxsam.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.maxsam.dao.entity.SamUser;

@Repository
@Transactional
public interface UserDao {
	public SamUser getUserLogin(int userId);
}
