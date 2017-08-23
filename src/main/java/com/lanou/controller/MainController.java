package com.lanou.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

	@RequestMapping(value = "/")
	public String fontPage() {

		return "index";
	}

	// 到登陆页面
	@RequestMapping(value = "/loginpage")
	public String loginPage() {

		return "loginpage";
	}

	// 用户界面
	@RequestMapping(value = "/userinfo")
	public String userinfoPage() {

		return "userinfo";
	}

	// form表单请求
	@RequestMapping(value = "/login")
	public String login(HttpServletRequest request, @RequestParam("username") String name,
			@RequestParam("password") String pwd) {

		HttpSession session = request.getSession();

		session.setAttribute("username", name);

		// 登录成功，重定向到userinfo页面
		return "redirect:userinfo";
	}

	// 登出
	@RequestMapping(value = "/logout")
	public String logout(HttpServletRequest request) {

		//登出就是清空session
		HttpSession session = request.getSession();

		session.invalidate();
		return "loginpage";
	}

}
