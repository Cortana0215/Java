package com.itheima.demo02;

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
