package com.maxsam.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.maxsam.service.UserLoginService;

@Controller
public class LoginController {

	@Autowired
	private UserLoginService userLoginService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView("login");
		return mav;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(String username, String password, boolean rememberMe) {
		ModelAndView mav = new ModelAndView("login");
		UsernamePasswordToken userPasswordToken = new UsernamePasswordToken(username, password);
		userPasswordToken.setRememberMe(rememberMe);
		SecurityUtils.getSubject().login(userPasswordToken);
		return mav;
	}

}
