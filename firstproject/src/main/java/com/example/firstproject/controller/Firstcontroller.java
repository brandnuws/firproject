package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Firstcontroller {
	@GetMapping("/hi")
	public String niceToMeetYou(Model model) {
		model.addAttribute("username", "沥快己");
		return "greetings"; // templates/greetings.mustache
	}
	
	@GetMapping("/bye")
	public String SeeYouNext(Model model) {
		model.addAttribute("username", "沥快己");
		return "goodBye";
		
	}
}
