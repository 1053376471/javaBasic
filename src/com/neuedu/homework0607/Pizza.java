package com.neuedu.homework0607;

public class Pizza {
    private String name;
    private int price;
    private int size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public Pizza(){
     super();
    }
    public Pizza(String name,int price,int size){
        super();
        this.size = size;
        this.price = price;
        this.name = name;
    }
    public String show(){
        return "这是制作披萨的方法！";
    }
}
