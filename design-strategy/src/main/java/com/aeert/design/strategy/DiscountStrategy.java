package com.aeert.design.strategy;

import java.math.BigDecimal;

/**
 * @Author l'amour solitaire
 * @Description 折扣8折收款
 * @Date 2020/11/20 上午8:59
 **/
public class DiscountStrategy extends CashStrategy{

    private static final Double discount = 0.8D;


    @Override
    BigDecimal cash(BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(discount));
    }
}
