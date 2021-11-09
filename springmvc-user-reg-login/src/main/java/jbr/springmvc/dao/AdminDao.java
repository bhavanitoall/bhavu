package jbr.springmvc.dao;

import jbr.springmvc.model.AdminLogin;
import jbr.springmvc.model.Login;
import jbr.springmvc.model.User;

public interface AdminDao {

	int register(AdminLogin adminlogin);
	AdminLogin validate(AdminLogin adminlogin);
}
