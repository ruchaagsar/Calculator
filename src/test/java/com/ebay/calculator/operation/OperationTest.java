package com.ebay.calculator.operation;

import com.ebay.calculator.operation.exception.OperationException;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class OperationTest {

    @Test
    public void testNumberOfOperations(){
        Assert.assertTrue(Operation.values().length == 4);
    }

    @Test
    public void testEachOperationValidity(){
        List<String> supportedOperations = new ArrayList<>();
        supportedOperations.add("ADD");
        supportedOperations.add("SUBTRACT");
        supportedOperations.add("MULTIPLY");
        supportedOperations.add("DIVIDE");

        for(String operation: supportedOperations){
            final Operation op = Operation.valueOf(operation);

            try {
                op.perform(null, 1);
                Assert.fail();
            }catch(OperationException ex){}

            try {
                op.perform(1, null);
                Assert.fail();
            }catch(OperationException ex){}
        }
    }


    @Test
    public void testDivideByZeroError(){
        try {
            Operation.DIVIDE.perform(1, 0);
            Assert.fail();
        }catch(OperationException ex){}
    }
}
