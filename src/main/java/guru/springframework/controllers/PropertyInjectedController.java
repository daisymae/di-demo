package guru.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import guru.springframework.services.GreetingServiceImpl;

/**
 * Example of doing it wrong
 * 
 * @author corcutt
 *
 * Mark as a Controller annotation to mark as a Spring component
 * so Spring Framework will manage as a SpringBean
 */
@Controller
public class PropertyInjectedController {


	/* use autowired annotation to tell Spring to inject this otherwise, get NPE */
	@Autowired
	public GreetingServiceImpl greetingService;
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
	
}
