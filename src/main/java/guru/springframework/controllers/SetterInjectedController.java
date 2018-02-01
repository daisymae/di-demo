package guru.springframework.controllers;

import guru.springframework.services.GreetingServiceImpl;

/**
 * Another bad example
 * 
 * @author corcutt
 *
 * Can make better by using the interface GreetingService so then any class
 * implementing the service can be used
 */
public class SetterInjectedController {

	private GreetingServiceImpl greetingService;
	
	String sayHello() {
		return greetingService.sayGreeting();
	}
	
	public void setGreetingService(GreetingServiceImpl greetingService) {
		this.greetingService = greetingService;
	}
}
