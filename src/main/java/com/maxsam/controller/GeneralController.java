package com.maxsam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.maxsam.dao.entity.SamUser;
import com.maxsam.service.UserLoginService;

@Controller
public class GeneralController {

	@Autowired
	private UserLoginService userLoginService;

	@RequestMapping(value = "/index/{userId}", method = RequestMethod.GET)
	public ModelAndView indexFtl(@PathVariable int userId) {
		ModelAndView mav = new ModelAndView("index");
		SamUser user = userLoginService.getLoginUser(userId);
		user.setPassword("测试中文：你好");
		mav.addObject("user", user);
		return mav;
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView("login");
		return mav;
	}

}
