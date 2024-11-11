package com.restapi.crud.service.implementation;

import com.restapi.crud.model.User;
import com.restapi.crud.repository.UserRepository;
import com.restapi.crud.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserImplementation implements UserService {

    UserRepository userRepository;

    public UserImplementation(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public String store(User user) {
        userRepository.save(user);
        return "Success";
    }

    @Override
    public String update(User user) {
        userRepository.save(user);
        return "Success";
    }

    @Override
    public String delete(String idUser) {
        userRepository.deleteById(idUser);
        return "Success";
    }

    @Override
    public User show(String idUser) {
        return userRepository.findById(idUser).get();
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
