package com.app.clint;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "WELCOME-API")  // should match the app name of welcome-api
public interface welcomeApiClient {

    @GetMapping("/welcome")
    public String invokeWelcomeApi();
}



