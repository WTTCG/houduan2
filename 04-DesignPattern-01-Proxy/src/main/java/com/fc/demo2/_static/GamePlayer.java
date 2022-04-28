package com.fc.demo2._static;

//游戏玩家，被代理对象，真实对象
public class GamePlayer implements GamePlay {

    @Override
    public void login() {
        System.out.println("使用  狂拽  登录游戏");
    }

    @Override
    public void killBoss() {
        System.out.println("狂拽 一刀99");
    }

    @Override
    public void upgrade() {
        System.out.println("恭喜 狂拽 升了一级");
    }
}

