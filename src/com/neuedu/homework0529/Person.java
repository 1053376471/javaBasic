package com.neuedu.homework0529;

public class Person {
    private String name;
    private int height;
    private String date;
    private String sayHello;

    public String getSayHello() {
        return sayHello;
    }

    public void setSayHello(String sayHello) {
        this.sayHello = sayHello;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public  void sayHello() {
        System.out.println("hello,my name is " +name);
    }
}

