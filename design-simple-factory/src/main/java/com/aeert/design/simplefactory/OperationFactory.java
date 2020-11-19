package com.aeert.design.simplefactory;

/**
 * @Author l'amour solitaire
 * @Description 计算器简单运算工厂
 * @Date 2020/11/19 上午10:41
 **/
public class OperationFactory {
    public static final String OPERATION_ADD = "+";
    public static final String OPERATION_SUB = "-";
    public static final String OPERATION_MUL = "*";
    public static final String OPERATION_DIVIDE = "/";

    public static Operation createOperation(Double numA, Double numB, String operate) {
        Operation operation = null;
        switch (operate) {
            case OPERATION_ADD:
                operation = new AddOperation(numA, numB);
                break;
            case OPERATION_SUB:
                operation = new SubOperation(numA, numB);
                break;
            case OPERATION_MUL:
                operation = new MultiplyOperation(numA, numB);
                break;
            case OPERATION_DIVIDE:
                operation = new DivideOperation(numA, numB);
                break;
            default:
                break;
        }
        return operation;
    }
}
