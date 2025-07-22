package com.marcktk.lakesidehotel.service;

import com.marcktk.lakesidehotel.model.User;

import java.util.List;

public interface  IUserService {
    User registerUser(User user);
    List<User> getUsers();
    void deleteUser(String email);
    User getUser(String email);
}
