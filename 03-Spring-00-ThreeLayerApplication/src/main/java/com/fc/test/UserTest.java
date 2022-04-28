package com.fc.test;

import com.fc.dao.impl.UserDaoImpl;
import com.fc.service.UserService;
import com.fc.service.impl.UserServiceImpl;
import org.junit.Test;


public class UserTest {
    @Test
    public void test(){
        UserService userService=new UserServiceImpl();
        userService.setUserDao(new UserDaoImpl());
        userService.useDateBase();
    }
}
