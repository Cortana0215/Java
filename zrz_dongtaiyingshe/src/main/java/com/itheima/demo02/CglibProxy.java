package com.itheima.demo02;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {
    public Object createProxy(Object target) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        MyAspect myAspect = new MyAspect();
        myAspect.before();
        Object obj = methodProxy.invokeSuper(proxy, args);
        myAspect.after();
        return obj;
    }
}
