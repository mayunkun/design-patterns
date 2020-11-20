package com.aeert.design;

import com.aeert.design.strategy.CashContext;
import com.aeert.design.strategy.NormalStrategy;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class DesignApplicationTests {

    @Test
    void test() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        System.out.println(new CashContext(CashContext.NORMAL_STRATEGY).getAmount(new BigDecimal("200")));
        System.out.println(new CashContext(CashContext.DISCOUNT_STRATEGY).getAmount(new BigDecimal("200")));
        System.out.println(new CashContext(CashContext.FULL_REDUCTION_STRATEGY).getAmount(new BigDecimal("200")));
    }

}
