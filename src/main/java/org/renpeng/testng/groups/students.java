package org.renpeng.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class students {

    public void student1(){
        System.out.println("student1输出11111");
    }
    public void student2(){
        System.out.println("student2输出22222");
    }
}
