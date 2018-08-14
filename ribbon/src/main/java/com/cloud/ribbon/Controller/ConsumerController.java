package com.cloud.ribbon.Controller;

import com.cloud.ribbon.service.ComputeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
public class ConsumerController {
    @Autowired
    ComputeService computeService;

    @GetMapping(value="/add")
    public String search()
    {
        return computeService.addService();
    }
}
