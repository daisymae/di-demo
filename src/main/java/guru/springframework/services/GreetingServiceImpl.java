package guru.springframework.services;

import org.springframework.stereotype.Service;
	
/* not using Spring for this, even though have the @Service annotation here */

@Service
public class GreetingServiceImpl implements GreetingService {

	public static final String HELLO_GURUS = "Hello Gurus!!! - Original";
	
	@Override
	public String sayGreeting() {
		return HELLO_GURUS;
	}
}
