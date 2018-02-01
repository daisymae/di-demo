package guru.springframework.controllers;

import org.springframework.stereotype.Controller;

import guru.springframework.services.GreetingService;

@Controller
public class MyController {

	private GreetingService greetingService;

	/*
	 * if do nothing else, this will not work because there are 4 beans that match
	 * GreetingService
	 * Works after adding @Primary to the PrimaryGreetingService, as the primarybean
	 * will be used if there are multiple beans that match the criteria
	 */
	public MyController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}

	public String hello() {
		return greetingService.sayGreeting();
	}
}
