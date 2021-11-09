package jbr.springmvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import jbr.springmvc.model.AdminLogin;
import jbr.springmvc.model.Login;
import jbr.springmvc.model.User;

public class AdminDaoImpl implements AdminDao{

	@Autowired
	  DataSource datasource;

	  @Autowired
	  JdbcTemplate jdbcTemplate;

	  public int register(AdminLogin adminlogin) {
	    String sql = "insert into users values(?,?)";

	    return jdbcTemplate.update(sql, new Object[] { adminlogin.getUsername(), adminlogin.getPassword()});
	  }

	  public AdminLogin validateAdminLogin(AdminLogin adminlogin) {
	    String sql = "select * from admin where username='" + adminlogin.getUsername() + "' and password='" + adminlogin.getPassword()
	        + "'";
	    List<AdminLogin> admin = jdbcTemplate.query(sql, new AdminLoginMapper());

	    return admin.size() > 0 ? admin.get(0) : null;
	  }

	@Override
	public AdminLogin validate(AdminLogin adminlogin) {
		// TODO Auto-generated method stub
		return null;
	}

	}

	class AdminLoginMapper implements RowMapper<AdminLogin> {

	  public AdminLogin mapRow(ResultSet rs, int arg1) throws SQLException {
	    AdminLogin adminlogin = new AdminLogin();

	    adminlogin.setUsername(rs.getString("username"));
	    adminlogin.setPassword(rs.getString("password"));
	  

	    return adminlogin;
	  }
	}

