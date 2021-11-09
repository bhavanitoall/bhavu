package jbr.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jbr.springmvc.model.AdminLogin;
import jbr.springmvc.model.Login;
import jbr.springmvc.model.User;
import jbr.springmvc.service.AdminService;
import jbr.springmvc.service.UserService;

@Controller
public class AdminLoginController {

	 @Autowired
	  AdminService adminService;

	  @RequestMapping(value = "/adminlogin", method = RequestMethod.GET)
	  public ModelAndView showAdminLogin(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("adminlogin");
	    mav.addObject("adminlogin", new AdminLogin());

	    return mav;
	  }
	 

	  @RequestMapping(value = "/adminloginProcess", method = RequestMethod.POST)
	  public ModelAndView adminloginProcess(HttpServletRequest request, HttpServletResponse response,
	      @ModelAttribute("adminlogin") AdminLogin adminlogin) {
	    ModelAndView mav = null;

	    AdminLogin admin = adminService.validateAdminLogin(adminlogin);

	    if (null != admin) {
	      mav = new ModelAndView("adminhome");
	      mav.addObject("firstname", admin.getFirstname());
	    } else {
	      mav = new ModelAndView("adminlogin");
	      mav.addObject("message", "Username or Password is wrong!!");
	    }

	    return mav;
	  }
	  
	   

	}


