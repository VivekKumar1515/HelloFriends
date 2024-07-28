package org.example.facebookapi.controller;

import org.example.facebookapi.model.User;
import org.example.facebookapi.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
public class Controller {
    @Autowired
    Service service;

    @PostMapping("post")
    public ResponseEntity<User> addUserInfo(@RequestParam Map<String, String> requestParam) {
        String file = requestParam.get("file");
        String post = requestParam.get("post");
        String username = requestParam.get("username");
        String email = requestParam.get("email");
        String profilePicture = requestParam.get("profilePicture");
        User user = new User();
        user.setUsername(username);
        user.setFile(file);
        user.setPost(post);
        user.setEmail(email);
        user.setProfilePicture(profilePicture);
        user.setTimeStamp(new Date().toString());
        service.addUser(user);
        return ResponseEntity.ok(user);
    }

    @GetMapping("post")
    public ResponseEntity<List<User>> getUserInfo() {
        return ResponseEntity.ok(service.getUsers());
    }
}
