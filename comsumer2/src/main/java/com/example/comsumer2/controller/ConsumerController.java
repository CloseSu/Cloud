package com.example.comsumer2.controller;

import com.example.comsumer2.entity.User;
import com.example.comsumer2.feign.UserFiegnClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    private UserFiegnClient userFiegnClient;

    @GetMapping("/consumer/{id}")
    public User findById(@PathVariable Long id){
        return this.userFiegnClient.findById(id);
    }
}
