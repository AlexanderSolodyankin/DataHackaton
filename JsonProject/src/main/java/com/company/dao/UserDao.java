package com.company.dao;

import com.company.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UserDao {
    private static HashMap<Long, User> users = new HashMap<>();


    public static List<User> getAllUsers(){
        return new ArrayList<>(users.values());
    }
}
