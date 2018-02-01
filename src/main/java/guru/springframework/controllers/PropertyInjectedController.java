package guru.springframework.controllers;

import guru.springframework.services.GreetingServiceImpl;

/**
 * Example of doing it wrong
 * 
 * @author corcutt
 *
 * Don't want to inject through properties
 * Case study of what NOT to do
 */
public class PropertyInjectedController {

	/* using concrete class name - ugh */
	public GreetingServiceImpl greetingService;
	
	String sayHello() {
		return greetingService.sayGreeting();
	}
	
}
