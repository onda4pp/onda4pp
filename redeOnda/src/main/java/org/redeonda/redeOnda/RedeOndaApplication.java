package org.redeonda.redeOnda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedeOndaApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(RedeOndaApplication.class, args);
	}
	
//	@GetMapping
//	public ModelAndView swaggerUi () {
//		return new ModelAndView("redirect:/swagger-ui/");
//	}

}
