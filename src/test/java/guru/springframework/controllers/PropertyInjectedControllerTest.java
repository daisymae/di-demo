package guru.springframework.controllers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import guru.springframework.services.GreetingServiceImpl;

/**
 * test the propertyInjectedController
 * @author corcutt
 *
 * Remember, this is a bad example of how to do this
 * this test, does run fine, however
 */
public class PropertyInjectedControllerTest {
	private PropertyInjectedController propertyInjectedController;
	
	@Before
	public void setUp() throws Exception {
		this.propertyInjectedController = new PropertyInjectedController();
		this.propertyInjectedController.greetingService = new GreetingServiceImpl();
	}

	@Test
	public void testGreeting() throws Exception {
		assertEquals(GreetingServiceImpl.HELLO_GURUS, propertyInjectedController.sayHello());
	}

}
