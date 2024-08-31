package com.ebay.calculator.operation.exception;

import org.junit.Assert;
import org.junit.Test;

public class OperationExceptionTest {

    @Test
    public void testOperationExceptionCreation(){
        Assert.assertTrue((new OperationException("Test Exception"))!=null);
    }
}
