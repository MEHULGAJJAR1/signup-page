package com.example.learning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class SessionController {
	
	@GetMapping("signup")
	public String signup() {
		return"Signup";
	}
	@GetMapping("login")
	public String login() {
		return"Login";
	}
	@PostMapping("saveuser")
	public String saveUser() {
		return"Login";
	}
	@GetMapping("/forgetpassword")
	public String forgetPassword() {
		return"ForgetPassword";
	}
	
	@GetMapping("sendOtp")
		public String sendOtp() {
			return"ChangePassword";
		}
	@GetMapping("updatepassword")
	public String updatePassword() {
			return"Login";
	
	}
	@GetMapping("changepassword")
	public String changePassword() {
		return"ChangePassword";
	}
	

}
