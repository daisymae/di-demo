package guru.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import guru.springframework.services.GreetingServiceImpl;

/**
 * Same issue as Setter
 * @author corcutt
 *
 * If refactor to use interface rather than implementation, can take in any type
 * that implements the interface.
 * 
 */
@Controller
public class ConstructorInjectedController {

	private GreetingServiceImpl greetingService;
	
	// @Autowired not needed, but denotes intention
	@Autowired
	public ConstructorInjectedController(GreetingServiceImpl greetingService) {
		this.greetingService = greetingService;
	}
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
}
