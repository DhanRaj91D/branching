package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.Input;
import com.example.demo.pojo.User;
import com.example.demo.service.Responseservice;

@RestController
public class ResponseController {
	@Autowired
	Responseservice service;

	@PostMapping("/bfhl")
	public ResponseEntity<?> response(@RequestBody Input data) {

		User user = service.getUser(data);
		if (user != null) {
			user.setIs_success(true);
		}

		return new ResponseEntity<>(user, HttpStatus.OK);
	}

}
