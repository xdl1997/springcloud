package com.cloud.feign.Controller;

import com.cloud.feign.Interface.ComputeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComsumerController {
    @Autowired
    ComputeClient computeClient;
    @GetMapping(value="/add")
    public String add()
    {
        return computeClient.add();
    }
}
