package com.example.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private MongoTemplate mongoTemplate;

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/hassan")
    public String hassan() {
        Query query = new Query();
        query.addCriteria(Criteria.where("name").is("Eric"));
        List<User> users = mongoTemplate.find(query, User.class);
        if (users.size() == 0)
            return "no user found";
        return users.get(0).getName();
    }

    @PostMapping("/add")
    public String Add() throws JsonProcessingException{
//        ObjectMapper mapper = new ObjectMapper();
//        if(user.getName() == null || user.getAge().equals(""))
//            return "no user name or age!";
        User user = new User();
        user.setName("Eric");
        user.setAge(45);
        mongoTemplate.insert(user);
        return "user has been added!";
    }

}
