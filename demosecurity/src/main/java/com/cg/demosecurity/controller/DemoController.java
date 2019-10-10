package com.cg.demosecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
	
	@GetMapping(value = "/admin")
	public String myAdmin() {
		return "AdminPage";
	}

	@GetMapping(value = "/user")
	public String myUser() {
		return "UserPage";
	}
	
	@GetMapping(value = "/")
	public String myHome() {
		return "HomePage";
	}
	
	
	/*
	 * @PostMapping(value="/logout") public String logoutPage (HttpServletRequest
	 * request, HttpServletResponse response) { Authentication auth =
	 * SecurityContextHolder.getContext().getAuthentication(); if (auth != null){
	 * new SecurityContextLogoutHandler().logout(request, response, auth); } return
	 * "HomePage";//You can redirect wherever you want, but generally it's a good
	 * practice to show login screen again. }
	 */
}
