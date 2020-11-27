package com.aeert.design.adapter;

/**
 * @Author l'amour solitaire
 * @Description 翻译
 * @Date 2020/11/27 上午11:12
 **/
public class Translator extends Player {
    private DomesticPlayer domesticPlayer = new DomesticPlayer(getName());

    public Translator(String name) {
        super(name);
    }

    @Override
    public void attack() {
        domesticPlayer.进攻();
    }

    @Override
    public void defense() {
        domesticPlayer.防守();
    }
}
