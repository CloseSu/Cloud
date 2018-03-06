package com.example.comsumer2.feign;

import com.example.comsumer2.entity.User;
import org.springframework.stereotype.Component;

@Component
public class HystrixClentFallback implements UserFiegnClient {
    @Override
    public User findById(Long id) {
        User user = new User();
        user.setId(0L);
        user.setName("nodata");
        user.setAge(999);
	return user;
    }
}
