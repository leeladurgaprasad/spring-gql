package com.example.springgql.query;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.springgql.model.User;
import com.example.springgql.service.UserService;
import org.springframework.stereotype.Component;

import java.util.List;

// TODO : need to resolve this
public class UserQuery implements GraphQLResolver<User> {

    private final UserService userService;

    public UserQuery(UserService userService) {
        this.userService = userService;
    }

    public List<com.example.springgql.model.User> getUsers() {
        return userService.getAllUsers();
    }
}
