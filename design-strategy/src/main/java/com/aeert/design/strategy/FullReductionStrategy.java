package com.aeert.design.strategy;

import java.math.BigDecimal;

/**
 * @Author l'amour solitaire
 * @Description 满减100收款策略
 * @Date 2020/11/20 上午8:59
 **/
public class FullReductionStrategy extends CashStrategy {

    private static final BigDecimal money = new BigDecimal("100");

    @Override
    BigDecimal cash(BigDecimal amount) {
        return amount.subtract(money);
    }
}
