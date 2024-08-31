package com.ebay.calculator;

import com.ebay.calculator.operation.Operation;

public class Main {

    private static Number calculate(int a, int b, Operation operation){
        return Calculator.calculate(operation, a, b);
    }

    private static Number calculate(int initialValue, Operation operation, int subsequentValue){
        Computable computable = new Calculator(initialValue).calculate(operation, subsequentValue);
        return computable.getCalculatedValue();
    }

    public static void main(String[] args){
        System.out.println(calculate(5,7, Operation.ADD));
        System.out.println(calculate(4, Operation.SUBTRACT, 2));
    }
}
