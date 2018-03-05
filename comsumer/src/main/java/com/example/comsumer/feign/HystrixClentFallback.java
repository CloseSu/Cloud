package com.example.comsumer.feign;

import com.example.comsumer.entity.User;
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
