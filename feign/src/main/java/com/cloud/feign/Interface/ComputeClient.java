package com.cloud.feign.Interface;

import com.cloud.feign.domain.ComputeClientHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(value="pokemon", fallback = ComputeClientHystrix.class)
public interface ComputeClient {
    @GetMapping(value="/add")
    String add();
}
