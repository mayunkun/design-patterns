package com.aeert.design;

import com.aeert.design.simplefactory.Operation;
import com.aeert.design.simplefactory.OperationFactory;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DesignApplicationTests {

    @Test
    void test() {
        Operation operation = OperationFactory.createOperation(1d, 2d, OperationFactory.OPERATION_ADD);
        System.out.println(operation.getResult());
        operation = OperationFactory.createOperation(1d, 2d, OperationFactory.OPERATION_SUB);
        System.out.println(operation.getResult());
        operation = OperationFactory.createOperation(1d, 2d, OperationFactory.OPERATION_MUL);
        System.out.println(operation.getResult());
        operation = OperationFactory.createOperation(1d, 2d, OperationFactory.OPERATION_DIVIDE);
        System.out.println(operation.getResult());
    }

}
