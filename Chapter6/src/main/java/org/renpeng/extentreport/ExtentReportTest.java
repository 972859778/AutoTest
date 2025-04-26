package org.renpeng.extentreport;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ExtentReportTest{
    @Test
    public void test1(){
        Assert.assertEquals(1,1);
    }
    @Test
    public void test2(){
        Assert.assertEquals(1,2);
    }
    @Test
    public void test3(){
        Assert.assertEquals("aa","aa");
    }
    @Test
    public void test4(){
        System.out.printf("nihao");

    }
    @Test
    public void test5(){
        Reporter.log("report测试");
        throw new RuntimeException("这是我自己抛出的异常");
    }
}
