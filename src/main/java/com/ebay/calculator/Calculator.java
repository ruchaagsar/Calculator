package com.ebay.calculator;

import com.ebay.calculator.exception.ComputableException;
import com.ebay.calculator.operation.Operation;

public class Calculator implements Computable {
    private Number value;
    private static Computable calculator;

    public Calculator(Number value){
        this.value = value;
    }

    public static Number calculate(Operation operation, Number a, Number b) {
        if(operation == null){
            throw new ComputableException("Undefined Operation Encountered.");
        }
        return operation.perform(a,b);
    }

    public Computable calculate(Operation operation, Number b) {
        if(operation == null){
            throw new ComputableException("Undefined Operation Encountered.");
        }
        value = operation.perform(value,b);
        return this;
    }

    public Number getCalculatedValue() {
        return value;
    }
}
