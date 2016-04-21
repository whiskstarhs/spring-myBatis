package org.alexanderhs.service.impl;

import javax.annotation.Resource;

import org.alexanderhs.dao.IUserDao;
import org.alexanderhs.pojo.User;
import org.alexanderhs.service.IUserService;
import org.springframework.stereotype.Service;



@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;
	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}

}
