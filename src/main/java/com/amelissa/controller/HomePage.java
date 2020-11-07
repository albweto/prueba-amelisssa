package com.amelissa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomePage {

	@RequestMapping(value = "/index")
	public String homePage() {
		return "index";
	}
}
