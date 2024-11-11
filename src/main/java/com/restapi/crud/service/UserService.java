package com.restapi.crud.service;

import com.restapi.crud.model.User;

import java.util.List;

public interface UserService {
    public String store(User user);
    public String update(User user);
    public String delete(String idUser);
    public User show(String idUser);
    public List<User> getAllUsers();
}
