package com.ebay.calculator;

import com.ebay.calculator.operation.Operation;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testStaticCalculateForEachOperation(){
        Assert.assertTrue(Calculator.calculate(Operation.ADD, 5,7).doubleValue() == 12.0);
        Assert.assertTrue(Calculator.calculate(Operation.SUBTRACT, 5,7).doubleValue() == -2.0);
        Assert.assertTrue(Calculator.calculate(Operation.MULTIPLY, 5,7).doubleValue() == 35.0);
        Assert.assertTrue(Calculator.calculate(Operation.DIVIDE, 7,5).doubleValue() == 1.4);
    }

    @Test
    public void testCalculateChainingForEachOperation(){
        double computedValue = new Calculator(5).calculate(Operation.ADD, 7).calculate(Operation.SUBTRACT,2).calculate(Operation.MULTIPLY,5).calculate(Operation.DIVIDE,25).getCalculatedValue().doubleValue();
        Assert.assertTrue(computedValue == 2);
    }
}
