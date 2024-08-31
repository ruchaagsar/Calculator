package com.ebay.calculator.operation;

import com.ebay.calculator.operation.exception.OperationException;

public enum Operation {
    ADD(){
        public Number perform(Number a, Number b){
            validate(a,b);
            return a.doubleValue() + b.doubleValue();
        }
    },
    SUBTRACT(){
        public Number perform(Number a, Number b){
            validate(a,b);
            return a.doubleValue() - b.doubleValue();
        }
    },
    MULTIPLY(){
        public Number perform(Number a, Number b){
            validate(a,b);
            return a.doubleValue() * b.doubleValue();
        }
    },
    DIVIDE(){
        public Number perform(Number a, Number b){
            validate(a,b);
            if(b.doubleValue() == 0.0){
                throw new OperationException("Divide by Zero error");
            }
            return a.doubleValue() / b.doubleValue();
        }
    };

    void validate(Number a, Number b){
        if(a == null || b == null){
            throw new OperationException("Null operand detected");
        }
    }

    public Number perform(Number a, Number b){
        return 0.0;
    }
}
