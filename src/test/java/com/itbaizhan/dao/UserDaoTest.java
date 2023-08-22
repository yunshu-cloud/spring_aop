package com.itbaizhan.dao;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoTest
{

    @Test
    public void testAdd(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        UserDao userDao = ac.getBean("userDao",UserDao.class);
        userDao.add();
    }

    @Test
    public void testDelete(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        UserDao userDao = ac.getBean("userDao",UserDao.class);
        userDao.deleteUser();
    }

    @Test
    public void testUpdate(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        UserDao userDao = ac.getBean("userDao",UserDao.class);
        userDao.update();
    }
}
