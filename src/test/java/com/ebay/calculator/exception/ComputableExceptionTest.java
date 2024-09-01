package com.ebay.calculator.exception;

import org.junit.Assert;
import org.junit.Test;

public class ComputableExceptionTest {
    @Test
    public void testComputableExceptionCreation(){
        Assert.assertTrue((new ComputableException("Test Exception"))!=null);
    }

}
