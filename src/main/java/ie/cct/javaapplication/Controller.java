package ie.cct.javaapplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/say-hello")
	public String sayHello() {
		return "Hello!";
	}
}
