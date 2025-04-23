package org.renpeng.testng.paramtest;

public class Student {
    String name;
    Integer age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String toString() {
        return "Studen{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
