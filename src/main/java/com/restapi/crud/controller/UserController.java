package com.restapi.crud.controller;

import com.restapi.crud.model.User;
import com.restapi.crud.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping()
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("{idUser}")
    public User show(@PathVariable("idUser") String idUser){
        return userService.show(idUser);
    }
    @PostMapping
    public String store(@RequestBody User user){
        userService.store(user);
        return "Success create user";
    }

    @PutMapping
    public String update(@RequestBody User user){
        userService.update(user);
        return "Success update user";
    }

    @DeleteMapping("{idUser}")
    public String delete(@PathVariable("idUser") String idUser){
        userService.delete(idUser);
        return "Success deleted user";
    }
}
