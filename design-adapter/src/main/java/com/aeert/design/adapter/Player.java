package com.aeert.design.adapter;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author l'amour solitaire
 * @Description 球员类
 * @Date 2020/11/27 上午10:55
 **/
@Data
@AllArgsConstructor
public abstract class Player {

    private String name;

    /**
     * 进攻
     **/
    public abstract void attack();

    /**
     * 防守
     **/
    public abstract void defense();
}
