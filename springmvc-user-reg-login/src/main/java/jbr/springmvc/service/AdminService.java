package jbr.springmvc.service;

import jbr.springmvc.model.AdminLogin;
import jbr.springmvc.model.Login;
import jbr.springmvc.model.User;

public interface AdminService {

	 int register(AdminLogin adminlogin);

	  AdminLogin validateAdminLogin(AdminLogin adminlogin);
	}

