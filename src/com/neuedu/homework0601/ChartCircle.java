package com.neuedu.homework0601;


public class ChartCircle extends Chart{
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void Perimeter() {
        System.out.println("圆的周长为：" + 2 * Math.PI * radius);
    }

    @Override
    public void area() {
        System.out.println("圆的面积为：" + Math.PI * radius * radius);
    }
}

