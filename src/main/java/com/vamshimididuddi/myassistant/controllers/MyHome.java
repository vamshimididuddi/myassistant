package com.vamshimididuddi.myassistant.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vamshimididuddi.myassistant.entities.Friend;
import com.vamshimididuddi.myassistant.repositories.FriendDataJpaRepository;
import com.vamshimididuddi.myassistant.services.FriendService;

@RestController
public class MyHome {

	Logger logger = LoggerFactory.getLogger(MyHome.class);

	@Autowired
	private FriendService friendService;

	@Autowired
	private FriendDataJpaRepository friendDataJpaRepository;

	@PostMapping("/addFriend")
	public ResponseEntity<String> addFriend(@RequestBody Friend friend, HttpServletRequest request,
			HttpServletResponse response) {
		logger.info("0;New friend request");
		if (friendService.isValid(friend)) {
			friendDataJpaRepository.save(friend);
			logger.info("0; Added friend details to database");
			return ResponseEntity.status(HttpStatus.CREATED).build();
		}
		logger.debug("0; unable to add friend as the request is not valid");
		return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).build();
	}

}
