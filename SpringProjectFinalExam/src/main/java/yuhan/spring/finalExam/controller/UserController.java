package yuhan.spring.finalExam.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import yuhan.spring.finalExam.userService.IUserService;
import yuhan.spring.finalExam.userService.UserLoginService;
import yuhan.spring.finalExam.userService.UserLogoutService;
import yuhan.spring.finalExam.userService.UserRegisterService;

@Controller
public class UserController {

	IUserService service;
	
	@RequestMapping(value="register")
	public String register() {
		return "user/register";
	}
	
	@RequestMapping(value="register.do", method=RequestMethod.POST)
	public String registerDo(HttpServletRequest request, Model model) {
		model.addAttribute("request", request);
		
		service = new UserRegisterService();
		service.excute(model);
		
		return "home";
	}
	
	@RequestMapping(value="login")
	public String login() {
		return "user/login";
	}
	
	@RequestMapping(value="login.do", method=RequestMethod.POST)
	public String loginDo(HttpServletRequest request, 
							HttpServletResponse response,
							Model model) throws Exception{
		
		model.addAttribute("request", request);
		model.addAttribute("response", response);
		
		service = new UserLoginService();
		service.excute(model);
		
		return "home";
	}
	
	@RequestMapping(value="logout.do")
	public String logoutDo(HttpServletRequest request, Model model) {
		model.addAttribute("request", request);
		
		service = new UserLogoutService();
		service.excute(model);
		
		return "redirect:home";
	}
	
}
