package com.example.demo1122jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SubjectProxy implements InvocationHandler {
    private Subject subject;

    public SubjectProxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("---------方法调用之前-------------");
        Object invoke = method.invoke(subject, args);
        System.out.println("---------方法调用之后-------------");
        return invoke;
    }
    }
