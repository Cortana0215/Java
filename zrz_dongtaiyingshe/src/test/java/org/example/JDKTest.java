package org.example;

import com.itheima.demo01.MyProxy;
import com.itheima.demo01.UserDao;
import com.itheima.demo01.UserDaoImpl;

public class JDKTest {
    public static void main(String[] args) {
        MyProxy jdkProxy = new MyProxy();
        UserDao userDao = new UserDaoImpl();
        UserDao userDao1 = (UserDao) jdkProxy.createProxy(userDao);
        userDao1.insert();
        userDao1.update();
        userDao1.delete();
    }
}
