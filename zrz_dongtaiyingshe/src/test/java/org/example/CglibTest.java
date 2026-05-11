package org.example;

import com.itheima.demo02.CglibProxy;
import com.itheima.demo02.UserDao;

public class CglibTest {
    public static void main(String[] args) {
        CglibProxy cglibProxy = new CglibProxy();
        UserDao userDao = new UserDao();
        UserDao userDao1 = (UserDao) cglibProxy.createProxy(userDao);
        userDao1.insert();
        userDao1.update();
        userDao1.delete();
    }
}
