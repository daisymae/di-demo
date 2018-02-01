package guru.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import guru.springframework.services.GreetingServiceImpl;

/**
 * Another bad example
 * 
 * @author corcutt
 *
 * Can make better by using the interface GreetingService so then any class
 * implementing the service can be used
 */
@Controller
public class SetterInjectedController {

	private GreetingServiceImpl greetingService;
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
	
	// for this example, need to use autowired on the setter
	@Autowired
	public void setGreetingService(GreetingServiceImpl greetingService) {
		this.greetingService = greetingService;
	}
}
