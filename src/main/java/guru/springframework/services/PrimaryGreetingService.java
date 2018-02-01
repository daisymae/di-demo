package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * created primary greeting service
 * @author corcutt
 *
 * With the addition of the @Primary annotation, if there are 
 * multiple beans that could satisfy a dependency, then this
 * one will be used
 */
@Service
@Primary
@Profile({"en", "default"})
public class PrimaryGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hello - Primary Greeting Service!";
	}

}
