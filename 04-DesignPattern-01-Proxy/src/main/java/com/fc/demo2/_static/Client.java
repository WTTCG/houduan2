package com.fc.demo2._static;

import org.junit.Test;

public class Client {
    @Test
    public void test(){
        //真实对象，网瘾少女狂拽
        GamePlayer player=new GamePlayer();

        //代练
        GamePlay proxy=new GamePlayProxy(player);

        proxy.login();
        proxy.killBoss();
        proxy.upgrade();
    }
}
