package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyPageController {
	
	@RequestMapping("/mpmain")
	public String mpmain() {
		return "mpmain";
	}
	

}
