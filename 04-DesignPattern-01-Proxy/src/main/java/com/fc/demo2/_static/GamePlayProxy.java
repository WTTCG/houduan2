package com.fc.demo2._static;

public class GamePlayProxy implements GamePlay {
    //代理中包含了一个真实对象
    private final GamePlayer player;

    public GamePlayProxy(GamePlayer player) {
        this.player = player;
    }

    @Override
    public void login() {
        this.verify();
        player.login();
    }

    @Override
    public void killBoss() {
        player.killBoss();
        this.addMoney();
    }

    @Override
    public void upgrade() {
        player.upgrade();
    }

    private void verify(){
        System.out.println("请输入您的手机验证码：");
    }

    private void addMoney(){
        System.out.println("掉了一堆金币和一把屠龙刀");
    }
}
