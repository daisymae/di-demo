package guru.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import guru.springframework.services.GreetingService;
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
	/* if change this from Impl to the interface, will fail UNLESS name the
	 * property the name of the bean.
	 * This can cause problems, however, because it does use reflection, 
	 * and dependent on property names
	 */
	@Autowired
//	public GreetingService greetingService; // this will fail
	public GreetingService greetingServiceImpl; // this will work through reflection
//	public GreetingServiceImpl greetingService; // this also works, but is hard-coded
	public String sayHello() {
		return greetingServiceImpl.sayGreeting();
	}
	
}
