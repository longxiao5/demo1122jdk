package com.example.demo1122jdk;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

@SpringBootApplication
public class Demo1122jdkApplication {

        public static void main(String[] args) {
            Subject subject = new SubjectImpl();
            InvocationHandler subjectProxy = (InvocationHandler) new SubjectProxy(subject);
            Subject proxyInstance = (Subject) Proxy.newProxyInstance(subjectProxy.getClass().getClassLoader(), subject.getClass().getInterfaces(), subjectProxy);
            proxyInstance.hello("LongXiao");
        }

    }

