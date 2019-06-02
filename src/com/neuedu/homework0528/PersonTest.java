package com.neuedu.homework0528;

public class PersonTest {
    public static void main(String[] args) {

        PersonCreate p1 = new PersonCreate();
        p1.setName("zhangsan");
        p1.setHeight(1.75);
        p1.setWidth(55);
        p1.setAge("33");
        p1.sayHello();
        PersonCreate p2 = new PersonCreate();
        p2.setName("lisi");
        p2.sayHello();
    }
}
