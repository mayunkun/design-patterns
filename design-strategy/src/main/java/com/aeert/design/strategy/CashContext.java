package com.aeert.design.strategy;

import lombok.AllArgsConstructor;

import java.math.BigDecimal;

/**
 * @Author l'amour solitaire
 * @Description 收费环境类
 * @Date 2020/11/20 上午9:12
 **/
@AllArgsConstructor
public class CashContext {

    public static final String NORMAL_STRATEGY = "Normal";
    public static final String DISCOUNT_STRATEGY = "Discount";
    public static final String FULL_REDUCTION_STRATEGY = "FullReduction";

    private String STRATEGY = NORMAL_STRATEGY;

    public String getAmount(BigDecimal amount) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        CashStrategy cashStrategy = (CashStrategy) Class.forName(String.format("com.aeert.design.strategy.%sStrategy", STRATEGY)).newInstance();
        return String.format("总价为: %s 实收金额为: %s", amount, cashStrategy.cash(amount));
    }
}
