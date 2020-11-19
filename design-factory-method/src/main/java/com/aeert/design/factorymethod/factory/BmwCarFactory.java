package com.aeert.design.factorymethod.factory;

import com.aeert.design.factorymethod.car.BmwCar;
import com.aeert.design.factorymethod.car.Car;

/**
 * @Author l'amour solitaire
 * @Description 宝马汽车工厂
 * @Date 2020/11/19 下午2:03
 **/
public class BmwCarFactory implements CarFactory {
    
    @Override
    public Car createCar() {
        return new BmwCar();
    }
}
