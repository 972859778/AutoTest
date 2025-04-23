package org.renpeng.testng.depend;

import org.testng.annotations.Test;

public class DependMethod {
    @Test
    public void test1(){
        System.out.println("run test1");
        throw new RuntimeException();
    }
    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("run test2");
    }
}
