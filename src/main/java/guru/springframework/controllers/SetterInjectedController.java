package guru.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.services.GreetingService;

/**
 * Another bad example
 * 
 * @author corcutt
 *
 * Added new implementations of the service, so remove the Impl class here and use
 * the interface so can inject different ones
 */
@Controller
public class SetterInjectedController {

	private GreetingService greetingService;
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
	
	// for this example, need to use autowired on the setter
	/* also use the @Qualifier here similar to that in the 
	 * ConstructorInjectedController. Can set on the method or
	 * on the parameter as in ConstructorInjectedController
	 */
	@Autowired
	@Qualifier("setterGreetingService")
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
}
