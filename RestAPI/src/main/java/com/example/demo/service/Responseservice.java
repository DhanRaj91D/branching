package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.pojo.Input;
import com.example.demo.pojo.User;

@Service
public class Responseservice {

	public User getUser(Input data) {
		User response = new User();
		List<Integer> num = new ArrayList<>();
		List<String> alphabate = new ArrayList<>();

		String[] arr = data.getData();
		for (int i = 0; i < arr.length; i++) {
			if (Character.isDigit(arr[i].charAt(0))) {
				num.add(Integer.parseInt(arr[i]));
			} else {
				alphabate.add(arr[i]);
			}
		}
		response.setUser_id("Dhanraj_Shivaji_Dhumal_16051998");
		response.setEmail("dhanraj.sdhumal@gmail.com");
		response.setRoll_number("PD1103");

		response.setNumbers(num);
		response.setAlphabets(alphabate);
		return response;
	}

}
