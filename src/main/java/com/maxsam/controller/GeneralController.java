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
		// SamUser user = new SamUser();
		// user.setUserId(1);
		// user.setUserName("Sam");
		// user.setPassword("Sam Password");
		mav.addObject("user", user);
		return mav;
	}
	
//	@RequestMapping(value = "/index", method = RequestMethod.GET)
//    public String index(@ModelAttribute("model") ModelMap model) {
// 
//        model.addAttribute("userList", userList);
// 
//        return "index";
//    }
}
