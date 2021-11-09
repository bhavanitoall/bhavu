package jbr.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;

import jbr.springmvc.dao.AdminDao;
import jbr.springmvc.dao.UserDao;
import jbr.springmvc.model.AdminLogin;
import jbr.springmvc.model.Login;
import jbr.springmvc.model.User;

public class AdminServiceImpl implements AdminService{
	@Autowired
	  public AdminDao adminDao;

	  public int register(AdminLogin adminlogin) {
	    return adminDao.register(adminlogin);
	  }

	  public AdminLogin validateAdminLogin(AdminLogin adminlogin) {
	    return adminDao.validate(adminlogin);
	  }

	}


