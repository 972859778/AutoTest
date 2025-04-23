package org.renpeng.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "th")
public class teachers {

    public void teacher1(){
        System.out.println("teacher1输出11111");
    }
    public void teacher2(){
        System.out.println("teacher2输出22222");
    }
}
