package guru.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.controllers.ConstructorInjectedController;
import guru.springframework.controllers.MyController;
import guru.springframework.controllers.PropertyInjectedController;
import guru.springframework.controllers.SetterInjectedController;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
		MyController controller = (MyController)ctx.getBean("myController");
		controller.hello();
		
		/* NOTE: these examples run once the Controllers are repaired 
		 * because the SERVICE is marked as such, so Spring Framework is 
		 * aware of it as well.
		 */
		
		// this now has the primarygreetingservice and should see that in the output
		// were getting 2 outputs from primarygreetingservice, due to propertyInjectedController
		// also picking up the primary
		System.out.println(controller.hello());
		
		// this fails with the code pulled from manualDI
		// once the controller is marked as such, still fails because haven't told Spring to inject GreetinService
		// once the service is autowired, this runs
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		
		
		// this also fails initially because controller is not a known bean
		// once marked as a controller, still get NPE for dependency
		// once the SETTER is autowired, this runs
		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
		
		// this also fails initially because controller is not a known bean
		// this works once the controller is marked; no autowiring needed
		// some people will still mark as Autowired to specify intention
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}
}
