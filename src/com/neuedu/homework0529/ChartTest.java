package com.neuedu.homework0529;

public class ChartTest {
    public static void main(String[] args) {
        ChartCircle chartCircle = new ChartCircle();
        chartCircle.setRadius(5);
        chartCircle.circumference();
        chartCircle.area();

        ChartSquare chartSquare = new ChartSquare();
        chartSquare.setSide(5);
        chartSquare.circumference();
        chartSquare.area();
    }
}
