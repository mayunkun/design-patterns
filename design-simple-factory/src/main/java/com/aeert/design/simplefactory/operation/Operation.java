package com.aeert.design.simplefactory.operation;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author l'amour solitaire
 * @Description Operation运算类
 * @Date 2020/11/19 上午10:42
 **/
@Data
@AllArgsConstructor
public abstract class Operation {

    /**
     * 参数A
     **/
    private Double numA;

    /**
     * 参数B
     **/
    private Double numB;

    public Double getResult() {
        return Double.NaN;
    }

}
