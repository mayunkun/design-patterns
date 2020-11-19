package com.aeert.design.simplefactory.operation;

/**
 * @Author l'amour solitaire
 * @Description 除法运算
 * @Date 2020/11/19 上午10:48
 **/
public class DivideOperation extends Operation {

    public DivideOperation(Double numA, Double numB) {
        super(numA, numB);
    }

    @Override
    public Double getResult() {
        return super.getNumA() / super.getNumB();
    }

}
