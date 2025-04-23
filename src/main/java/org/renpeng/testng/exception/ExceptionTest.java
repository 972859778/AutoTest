package org.renpeng.testng.exception;

import org.testng.annotations.Test;

public class ExceptionTest {
    @Test(expectedExceptions = RuntimeException.class)
    public void runtimeExceptionTest(){
        System.out.println("抛出运行时异常");
        throw new RuntimeException();
    }
}
