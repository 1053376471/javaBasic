package com.neuedu.homework0601;


public class ChartSquare extends Chart {
    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    private int side;



    @Override
    public void Perimeter() {
        System.out.println("正方形的周长为：" + 4 * side);
    }

    @Override
    public void area() {
        System.out.println("正方形的面积为：" + side * side);
    }
}

