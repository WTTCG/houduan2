package com.fc.demo01._cglib;

import com.fc.demo01._static.Lawsuit;

//原告，被代理对象，真实对象
public class Parties implements Lawsuit {
    @Override
    public void submit() {
        System.out.println("江南皮革厂倒闭了，老板跑路了");
    }

    @Override
    public void defined() {
        System.out.println("还我血汗钱");
    }
}
