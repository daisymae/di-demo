package guru.springframework.controllers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import guru.springframework.services.GreetingServiceImpl;

public class SetterInjectedControllerTest {

	private SetterInjectedController setterInjectedController;
	
	@Before
	public void setUp() throws Exception {
		this.setterInjectedController = new SetterInjectedController();
		/* acting like the spring framework here and injecting into the setter
		 * if comment out this line, will get NPE
		 */
		this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
	}
	
	@Test
	public void testGreeting() throws Exception {
		assertEquals(GreetingServiceImpl.HELLO_GURUS, setterInjectedController.sayHello());
	}

}
