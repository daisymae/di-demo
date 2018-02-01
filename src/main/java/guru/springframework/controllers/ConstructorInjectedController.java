package guru.springframework.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.services.GreetingService;

/**
 * Same issue as Setter
 * @author corcutt
 *
 * Added some new service implementations, so change this to use the interface to 
 * be able to use any of them
 * 
 */
@Controller
public class ConstructorInjectedController {

	private GreetingService greetingService;
	
	/* use the qualifier annotation
	 * it takes a string, which is the bean name
	 */
	public ConstructorInjectedController(@Qualifier("constructorGreetingService")GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
}
