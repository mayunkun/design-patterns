package com.aeert.design.adapter;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author l'amour solitaire
 * @Description 国内球员
 * @Date 2020/11/27 上午11:09
 **/
@Data
@AllArgsConstructor
public class DomesticPlayer {

    private String name;

    /**
     * 进攻
     **/
    public void 进攻() {
        System.out.println("球员 " + getName() + " 发起进攻！");
    }

    /**
     * 防守
     **/
    public void 防守() {
        System.out.println("球员 " + getName() + " 快速防守！");
    }
}
