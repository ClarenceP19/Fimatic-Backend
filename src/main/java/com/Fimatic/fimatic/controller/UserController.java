package com.Fimatic.fimatic.controller;


import com.Fimatic.fimatic.model.User;
import com.Fimatic.fimatic.payload.ApiResponse;
import com.Fimatic.fimatic.payload.LoginRequest;
import com.Fimatic.fimatic.payload.RegisterRequest;
import com.Fimatic.fimatic.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepository userRepository;
    @CrossOrigin()
    @PostMapping("/login")
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest
    ){
        User user = userRepository.findUserByUsernameAndPassword(loginRequest.getUsername(),loginRequest.getPassword());
        System.out.println(user);
        //cannot find user with username and password
        if(user == null){
            return ResponseEntity.ok(new ApiResponse(false,"No such user with username and password found"));
        }else{
            return ResponseEntity.ok(user);
        }


    }



//    @PostMapping("/register")
//    public ResponseEntity<?> registerUser(@Valid @RequestBody RegisterRequest registerRequest
//                                          ){
//
//        User user = new User(registerRequest.getUsername(),registerRequest.getPassword());
//        if(user != null){
//            userRepository.save(user);
//            return ResponseEntity.ok(user);
//        }else{
//            return ResponseEntity.ok(new ApiResponse(false,"Could not register "));
//        }
//
//        //cannot find user with username and password
//    }

    //register

    //login
//    public static User createUser(){
//        User user= new User();
//    }
}
