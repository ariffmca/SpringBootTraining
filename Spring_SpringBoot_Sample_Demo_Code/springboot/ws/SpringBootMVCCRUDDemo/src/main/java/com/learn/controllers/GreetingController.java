package com.learn.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingController {

	@RequestMapping(value="/morningmsg")
	public String printMorningGreeting(ModelMap modelMap) {
		modelMap.addAttribute("welcomeMsg","Hello All <I>Good Morning </I>");
		return "morning-message";
	}
	
	@RequestMapping(value="/eveningmsg")
	public String printEveningGreeting(ModelMap modelMap) {
		modelMap.addAttribute("welcomeMsg","Hello All <I>Good Evening </I>");
		return "evening-message";
	}
}
