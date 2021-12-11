package com.example.firstproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.firstproject.repository.FindAllRepository;
import com.example.firstproject.repository.ManagedFreeRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor //final 필드값을 알아서 가져옴
@Controller
public class TestController {
	@Autowired
	private final ManagedFreeRepository managedFreeRepository;
	
	
	@GetMapping("/home")
	public String Test(Model model) {
		model.addAllAttributes(managedFreeRepository.findAll());
		return "content/home";
		
	}

}
