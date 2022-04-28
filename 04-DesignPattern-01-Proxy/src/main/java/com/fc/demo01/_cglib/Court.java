package com.fc.demo01._cglib;

import com.fc.demo01._jdk.Lawsuit;
import net.sf.cglib.proxy.Enhancer;
import org.junit.Test;

public class Court {
    @Test
    public void test(){
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(Parties.class);
        enhancer.setCallback(new LawOffice());
        Parties proxy=(Parties) enhancer.create();

        proxy.submit();
        proxy.defined();
    }
}
