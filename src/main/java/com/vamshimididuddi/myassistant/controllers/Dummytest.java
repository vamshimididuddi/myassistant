package com.vamshimididuddi.myassistant.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/")
@Api(value = "Dummy controller", description = "Dummy api for testing", produces ="text/plain")
public class Dummytest {

	Logger logger = LoggerFactory.getLogger(Dummytest.class);

	@ApiOperation(value = "get test", response = String.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Test Successful", response = String.class),
			@ApiResponse(code = 500, message = "Internal Server Error"),
			@ApiResponse(code = 404, message = "Customer not found") })
	//@RequestMapping(value = "/getTest", method = RequestMethod.GET)
	@GetMapping("/getTest")
	public String dummyGet(HttpServletRequest request, HttpServletResponse response) {
		response.setStatus(200);
		logger.info("Successfully tested the get part of application");
		return "yes successful";
	}


	@ApiOperation(value = "post test", response = String.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Test Successful", response = String.class),
			@ApiResponse(code = 500, message = "Internal Server Error"),
			@ApiResponse(code = 404, message = "Customer not found") })
	//@RequestMapping(value = "/postTest", method = RequestMethod.POST)
	@PostMapping("/postTest")
	public String dummyPost(@RequestBody String data, HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		response.setStatus(200);
		logger.info("Successfully tested the  post part of application {} is the data sent", data);
		return "yes successful";
	}

}
