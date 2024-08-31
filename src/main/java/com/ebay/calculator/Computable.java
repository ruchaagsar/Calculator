package com.ebay.calculator;

import com.ebay.calculator.operation.Operation;

public interface Computable {
    Computable calculate(Operation operation, Number b);

    Number getCalculatedValue();
}
