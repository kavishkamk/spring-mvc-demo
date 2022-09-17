package io.github.kavishkamk.springdemo.mvc;

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
		return "helloWorld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processFormTwo")
	public String processFormTwo(HttpServletRequest request, Model model) {
		
		String firstName = request.getParameter("firstName");
		
		firstName = firstName.toUpperCase();
		
		model.addAttribute("message", "hello " + firstName);
		
		return "helloworld";
	}
	
	@RequestMapping("/processFormThree")
	public String processFormThree(@RequestParam("firstName") String firstName, Model model) {
		
		firstName = firstName.toUpperCase();
		
		model.addAttribute("message", "hello " + firstName);
		
		return "helloworld";
	}

}
