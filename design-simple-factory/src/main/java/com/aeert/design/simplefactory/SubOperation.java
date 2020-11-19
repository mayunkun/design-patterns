package com.aeert.design.simplefactory;

/**
 * @Author l'amour solitaire
 * @Description 减法运算
 * @Date 2020/11/19 上午10:48
 **/
public class SubOperation extends Operation {

    public SubOperation(Double numA, Double numB) {
        super(numA, numB);
    }

    @Override
    public Double getResult() {
        return super.getNumA() - super.getNumB();
    }

}
