package com.aeert.design.strategy;

import java.math.BigDecimal;

/**
 * @Author l'amour solitaire
 * @Description 抽象现金收款策略
 * @Date 2020/11/20 上午8:59
 **/
public abstract class CashStrategy {

    /**
     * @Author l'amour solitaire
     * @Description TODO
     * @Date 2020/11/20 上午8:59
     **/
    abstract BigDecimal cash(BigDecimal amount);
}
