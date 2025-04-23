package org.renpeng.testng.paramtest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class ParameterTest {
    @Test(dataProvider = "data")
    public void paramTest(String name, int age) {
        System.out.println("name = " + name + ";  age =" + age);
    }

    @Test(dataProvider = "getData")
    public void test1(String name, int age) {
        System.out.println("test111111输出name = " + name + ";  age =" + age);
    }

    @Test(dataProvider = "getData")
    public void test2(String name, int age) {
        System.out.println("test222222输出name = " + name + ";  age =" + age);
    }

    @DataProvider(name = "data")
    public Object[][] data() {
        Object[][] obj = new Object[][]{
                {"zhangsan", 12},
                {"lishi", 15}
        };
        return obj;
    }

    @DataProvider(name = "getData")
    public Object[][] getData(Method method) {
        Object[][] obj = null;
        if (method.getName().equals("test1")) {
            obj = new Object[][]{
                    {"zhangsan ", 20},
                    {"lisi", 25}
            };
        } else {
            obj = new Object[][]{
                    {"wangwu ", 50},
                    {"maliu", 65}
            };
        }

        return obj;
    }
}