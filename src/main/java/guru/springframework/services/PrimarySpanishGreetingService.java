package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Primary greeting in Spanish
 * 
 * @author corcutt
 * 
 * Set the profile. Can also mark as Primary, which you might think
 * would cause a conflict, but will not because the profile is not
 * active so Spring will ignore it 
 */
@Service
@Profile("es")
@Primary
public class PrimarySpanishGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Servico de Saludo Primario";
	}

}
