package com.aeert.design;

import com.aeert.design.factorymethod.factory.BeezCarFactory;
import com.aeert.design.factorymethod.factory.BmwCarFactory;
import com.aeert.design.factorymethod.factory.CarFactory;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DesignApplicationTests {

    @Test
    void test() {
        CarFactory carFactory = new BeezCarFactory();
        System.out.println(carFactory.createCar().carName());
        carFactory = new BmwCarFactory();
        System.out.println(carFactory.createCar().carName());
    }

}
