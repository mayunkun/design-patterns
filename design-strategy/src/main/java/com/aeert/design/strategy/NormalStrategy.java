package com.aeert.design.strategy;

import java.math.BigDecimal;

/**
 * @Author l'amour solitaire
 * @Description 正常收款
 * @Date 2020/11/20 上午9:01
 **/
public class NormalStrategy extends CashStrategy {

    @Override
    BigDecimal cash(BigDecimal amount) {
        return amount;
    }
}
