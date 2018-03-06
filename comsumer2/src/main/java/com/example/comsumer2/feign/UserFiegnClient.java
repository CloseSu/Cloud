package com.example.comsumer2.feign;

import com.example.comsumer2.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "provider-user", fallback = HystrixClentFallback.class)
public interface UserFiegnClient {
    @GetMapping("/user/{id}")
    User findById(@PathVariable("id") Long id);
}
