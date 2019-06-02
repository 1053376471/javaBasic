package com.neuedu.homework0529;

public class ChartCircle {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void circumference(){
        System.out.println("圆的周长为"+2*radius*3.14);
    }
    public void area(){
        System.out.println("圆的面积为"+radius*radius*3.14);
    }
}
