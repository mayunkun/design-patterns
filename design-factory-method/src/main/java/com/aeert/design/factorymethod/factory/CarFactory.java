package com.aeert.design.factorymethod.factory;

import com.aeert.design.factorymethod.car.Car;

/**
 * @Author l'amour solitaire
 * @Description 汽车工厂
 * @Date 2020/11/19 下午2:02
 **/
public interface CarFactory {

    /**
     *
     **/
    Car createCar();
}
