package com.aeert.design.factorymethod.car;

/**
 * @Author l'amour solitaire
 * @Description 宝马
 * @Date 2020/11/19 下午2:09
 **/
public class BmwCar implements Car {

    @Override
    public String carName() {
        return "BMW";
    }
}
