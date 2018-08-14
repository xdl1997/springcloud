package com.cloud.feign.domain;

import com.cloud.feign.Interface.ComputeClient;
import org.springframework.stereotype.Component;

@Component
public class ComputeClientHystrix implements ComputeClient {

    @Override
    public String add() {
        return "-9999";
    }
}
