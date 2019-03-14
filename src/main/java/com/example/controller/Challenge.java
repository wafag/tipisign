package com.example.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Challenge {

	@RequestMapping(value = "/challenge", method = RequestMethod.POST)
	private String permissionScope(@RequestBody String payload) {

		System.out.println("payload" + payload);
		int beginIndex = payload.indexOf("challenge");
		int endIndex = payload.indexOf("type");
		String challengeValue = payload.substring(beginIndex + 12, endIndex - 3);
		System.out.println("challenge value = " + challengeValue);
		return challengeValue;
	}

}
