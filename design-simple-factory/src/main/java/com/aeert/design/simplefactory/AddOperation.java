package com.aeert.design.simplefactory;

import lombok.AllArgsConstructor;

/**
 * @Author l'amour solitaire
 * @Description 加法运算
 * @Date 2020/11/19 上午10:48
 **/
public class AddOperation extends Operation {

    public AddOperation(Double numA, Double numB) {
        super(numA, numB);
    }

    @Override
    public Double getResult() {
        return super.getNumA() + super.getNumB();
    }

}
