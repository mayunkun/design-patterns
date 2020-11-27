package com.aeert.design.adapter;

/**
 * @Author l'amour solitaire
 * @Description 外国球员
 * @Date 2020/11/27 上午10:57
 **/
public class ForeignPlayer extends Player {

    public ForeignPlayer(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("球员 " + getName() + " 发起进攻！");
    }

    @Override
    public void defense() {
        System.out.println("球员 " + getName() + " 快速防守！");
    }
}
