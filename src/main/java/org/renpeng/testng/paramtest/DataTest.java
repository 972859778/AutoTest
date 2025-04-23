package org.renpeng.testng.paramtest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataTest   {
    @Test
    @Parameters("data")
    public void test(String name,int age){
        System.out.println("name ="+name+"  ;age= "+age);
    }


}
