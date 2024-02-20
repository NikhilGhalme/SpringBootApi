package com.nikhil.User;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public ResponseEntity<String> addUser(User user) {
        if(user != null) {
            System.out.println(user);
            return ResponseEntity.ok().body("ok");
        }
        else {
            return ResponseEntity.internalServerError().body("not ok");
        }
    }
}
