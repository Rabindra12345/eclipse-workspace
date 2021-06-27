package com.rabindra.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	//need a controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//need a controller method to process a form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	//a new controller method to process the form
	@RequestMapping("/processFormLotTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		//read the request parameter from HTML form
		String theName= request.getParameter("applicantName");
		
		//convert the name into all caps
		theName = theName.toUpperCase();
		
		//write the message 
		String result = "Yo! " + theName +", What's up Hommie...";
		
		//add message to the model
		model.addAttribute("message", result);
		return "helloworld";
	}
	//a new method to process the form
	@RequestMapping("/processFormLotThree")
	public String processFormVersionThree(
			@RequestParam("applicantName") String theName, Model model) {
		
		//convert the name into all caps
		theName = theName.toUpperCase();
		
		//write the message 
		String result = "Yo! how's everything DAWG!!" + theName +", let's fucking go...";
		
		//add message to the model
		model.addAttribute("message", result);
		return "helloworld";
	}
	
}
