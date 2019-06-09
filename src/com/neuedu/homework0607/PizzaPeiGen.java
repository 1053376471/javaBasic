package com.neuedu.homework0607;

public class PizzaPeiGen extends Pizza {
    private int keNum;

    public int getKeNum() {
        return keNum;
    }

    public void setKeNum(int keNum) {
        this.keNum = keNum;
    }

    public PizzaPeiGen() {
        super();
    }
    public PizzaPeiGen(int size, int price, String name, int keNum) {
        super(name,size, price);
        this.keNum = keNum;
    }
    public String show(){
        return "名称:"+super.getName()+"价格:"+super.getPrice()+"元"+"大小:"+super.getSize()+"寸"+"培根克数:"+keNum;
    }

}