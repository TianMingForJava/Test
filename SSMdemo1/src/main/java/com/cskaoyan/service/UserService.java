package com.cskaoyan.service;


import com.cskaoyan.bean.User;

public interface UserService {
    User queryUserByUsernameAndpassword(String username, String password);
}
