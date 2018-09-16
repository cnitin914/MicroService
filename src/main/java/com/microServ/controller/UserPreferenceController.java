package com.microServ.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myPreferences")
public class UserPreferenceController {
	

	@Value("${callInNight}")
	String callAtNight;
	
	@RequestMapping(path="/callAtNight", method=RequestMethod.GET)
	public String callAtNight() {
	
		return callAtNight;
	}

}
