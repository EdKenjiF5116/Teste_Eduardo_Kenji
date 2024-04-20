package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/users")
public class TASK5 {

    @PostMapping
    public String createUser(@RequestBody User user) {
        return "User created successfully";
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return new User();
    }

    @PutMapping("/{id}")
    public String updateUser(@PathVariable Long id, @RequestBody User user) {
        return "User updated successfully";
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        return "User deleted successfully";
    }

    public static void main(String[] args) {
        SpringApplication.run(TASK5.class, args);
    }
}

class User {
    private Long id;
    private String name;
    private String email;

}