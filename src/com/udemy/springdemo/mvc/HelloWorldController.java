package com.udemy.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processFormv2")
	public String letShoutDude(HttpServletRequest request, Model model) {
		
		String name = request.getParameter("studentName");
		
		name = name.toUpperCase();
		
		name = "YOYO! " + name;
		
		model.addAttribute("message", name);
		
		return "helloworld";
	}
	
	@RequestMapping("/processFormv3")
	public String processFormv3(@RequestParam("studentName") String name, Model model) {
				
		name = name.toUpperCase();
		
		name = "Hey V3. " + name;
		
		model.addAttribute("message", name);
		
		return "helloworld";
	}
}
