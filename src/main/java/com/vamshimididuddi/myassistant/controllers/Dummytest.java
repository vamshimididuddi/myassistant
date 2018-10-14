package com.vamshimididuddi.myassistant.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Dummytest {
	
	@GetMapping("/test")
	public String dummy(HttpServletRequest request, HttpServletResponse response){
		response.setStatus(200);
		return "yes successful";
	}

}
