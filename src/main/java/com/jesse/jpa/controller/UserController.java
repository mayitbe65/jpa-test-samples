package com.jesse.jpa.controller;

import com.jesse.jpa.bean.User;
import com.jesse.jpa.mapper.UserRepository;
import com.jesse.jpa.utils.UpdateUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @author yu.zhang
 * created on 2021-08-27
 */
@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserRepository userRepository;


    @GetMapping("/user/list")
    public List<User> userList() {
        return userRepository.findAll();
    }

    @GetMapping("/user/detail/{id}")
    public User userDetail(@PathVariable("id") Integer id) {
//        return userRepository.getOne(1);
        if (userRepository.findById(id).isPresent()) {
            return userRepository.findById(id).get();
        }
        return null;
    }

    @PostMapping("/user/create")
    public User userAdd(@RequestBody User user) {
        return userRepository.save(user);
    }

    @PostMapping("/user/update")
    public User userUpdate(@RequestBody User user) {
        Optional<User> optionalUser = userRepository.findById(user.getId());
        if (!optionalUser.isPresent()) {
            return null;
        }
        User updateUser = optionalUser.get();
        BeanUtils.copyProperties(user, updateUser, UpdateUtil.getNullPropertyNames(user));
        return userRepository.save(updateUser);
    }
}
