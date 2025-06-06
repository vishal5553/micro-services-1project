package com.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.clint.welcomeApiClient;

@RestController
public class greetRestController {

    private final welcomeApiClient apiClient;

	
	  // Constructor Injection — Spring injects the Feign client here public
	  greetRestController(welcomeApiClient apiClient) { this.apiClient = apiClient;
	  }
	 
    
		/*
		 * @Autowired private WelcomeApiClient apiClient;
		 */

    @GetMapping("/greet")
    public String getGreetMsg() {
        String greetMsg = "Welcome to Greet-API!, ";
        String welcomeMsg = apiClient.invokeWelcomeApi();
        return greetMsg + welcomeMsg;
    }
}
