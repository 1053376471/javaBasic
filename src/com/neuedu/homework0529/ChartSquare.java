package com.neuedu.homework0529;

public class ChartSquare {
    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
    public void circumference(){
        System.out.println("正方形的周长为"+4*side);
    }
    public void area(){
        System.out.println("正方形的面积为" +side*side);
    }
}
