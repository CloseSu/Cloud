package com.example.comsumer.controller;

import com.example.comsumer.entity.User;
import com.example.comsumer.feign.UserFiegnClient;
import org.springframework.beans.factory.annotation.Autowired;
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
