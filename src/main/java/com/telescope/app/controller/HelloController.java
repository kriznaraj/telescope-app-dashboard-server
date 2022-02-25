package com.telescope.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping(value = "/anonymous")
    public ResponseEntity<String> getAnonymous() {
        return ResponseEntity.ok("Hello Anonymous");
    }

    @RolesAllowed("user")
    @GetMapping(value = "/user")
    public ResponseEntity<String> getUser() {
        return ResponseEntity.ok("Hello User");
    }

    @GetMapping(value = "/admin")
    public ResponseEntity<String> getAdmin() {
        return ResponseEntity.ok("Hello Admin");
    }

    @GetMapping(value = "/all-user")
    public ResponseEntity<String> getAllUser() {
        return ResponseEntity.ok("Hello All User");
    }
}
