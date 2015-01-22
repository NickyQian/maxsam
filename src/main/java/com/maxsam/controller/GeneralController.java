package com.maxsam.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GeneralController {
	@RequestMapping(value = "index")
	public void index_jsp(Model model) {
		model.addAttribute("name", "Sam 你好！");
		System.out.println("index.jsp");
	}

	@RequestMapping(value = "index/{user_id}", method = RequestMethod.GET)
	public String showMessage(@PathVariable String msg, HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("message", msg); // 设置返回消息
		return "message"; // 设置返回页面，这里对应 /WEB-INF/view 目录下的 message.ftl 文件
	}

	@RequestMapping(value = "index/add")
	public String addMessage(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("message", "message is added");
		return "message";

	}
}
