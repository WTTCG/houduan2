package com.fc.demo2._cglib;

import com.fc.demo2._static.GamePlay;

//游戏玩家，被代理对象，真实对象
public class GamePlayer implements GamePlay {

    private final String username;

    public GamePlayer(String username) {
        this.username = username;
    }

    @Override
    public void login() {
        System.out.println(username + "使用  狂拽  登录游戏");
    }

    @Override
    public void killBoss() {

        System.out.println(username+"使用 狂拽 一刀99");
    }

    @Override
    public void upgrade() {

        System.out.println(username+"使用 狂拽 升了一级");
    }
}

