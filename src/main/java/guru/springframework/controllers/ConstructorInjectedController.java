package guru.springframework.controllers;

import guru.springframework.services.GreetingServiceImpl;

/**
 * Same issue as Setter
 * @author corcutt
 *
 * If refactor to use interface rather than implementation, can take in any type
 * that implements the interface.
 */
public class ConstructorInjectedController {

	private GreetingServiceImpl greetingService;
	
	public ConstructorInjectedController(GreetingServiceImpl greetingService) {
		this.greetingService = greetingService;
	}
	
	String sayHello() {
		return greetingService.sayGreeting();
	}
}
