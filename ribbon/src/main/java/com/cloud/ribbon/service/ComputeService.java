package com.cloud.ribbon.service;

//import com.netflix.ribbon.proxy.annotation.Hystrix;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.hystrix.FallbackHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class ComputeService {

    @Autowired
    RestTemplate restTemplate;


    @HystrixCommand(fallbackMethod = "addServiceFallback")
    public String addService() {
        return restTemplate.getForEntity("http://POKEMON/add", String.class).getBody();
    }

    public String addServiceFallback () {
        return "error";
    }

}
