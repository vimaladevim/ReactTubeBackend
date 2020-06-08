package com.reacttube.backend.controllers;

import com.reacttube.backend.contract.UserRequest;
import com.reacttube.backend.contract.UserResponse;
import com.reacttube.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserControllers {

    final UserService userService;

    public UserControllers(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public UserResponse getUser(@RequestParam("user_id") String userId){
        return userService.getUser(userId);
    }
    @PostMapping
    public void addUser(@RequestBody UserRequest userRequest)
    {
        userService.addUser(userRequest);
    }
}
