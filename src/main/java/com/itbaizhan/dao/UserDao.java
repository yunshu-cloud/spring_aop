package com.itbaizhan.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao
{
    public void add(){
        System.out.println("用户新增");
    }

    public void deleteUser(){
        System.out.println("用户删除");
    }

    public void update(){
        System.out.println("用户修改");
    }
}
