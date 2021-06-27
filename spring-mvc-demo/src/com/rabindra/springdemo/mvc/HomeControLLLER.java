package com.rabindra.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControLLLER {
	
	@RequestMapping("/")
	public String showPage() {
		return "main-menu";
	}
	
}
