package com.aeert.design;

import com.aeert.design.simplefactory.Operation;
import com.aeert.design.simplefactory.OperationFactory;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class DesignApplicationTests {

    @Test
    void contextLoads() {
		Operation operation = OperationFactory.createOperation(1d,2d,"+");
		System.out.println(operation.getResult());
		operation = OperationFactory.createOperation(1d,2d,"-");
		System.out.println(operation.getResult());
        operation = OperationFactory.createOperation(1d,2d,"*");
        System.out.println(operation.getResult());
        operation = OperationFactory.createOperation(1d,2d,"/");
        System.out.println(operation.getResult());
    }

}
