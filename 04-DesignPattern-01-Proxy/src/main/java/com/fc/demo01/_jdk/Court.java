package com.fc.demo01._jdk;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Court {
    @Test
    public void test(){
        Lawsuit parties=new Parties();

        //获取律师事务所
        InvocationHandler lawOffice=new LawOffice(parties);

        Lawsuit proxy = (Lawsuit) Proxy.newProxyInstance(parties.getClass().getClassLoader(),
                parties.getClass().getInterfaces(), lawOffice);

        proxy.submit();
        proxy.defined();
    }
}
