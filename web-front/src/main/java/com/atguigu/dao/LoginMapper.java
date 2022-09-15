package com.atguigu.dao;


import com.atguigu.vo.User;

public interface LoginMapper {
   User  checkUser(User suer);

    void insert(User user);
}
