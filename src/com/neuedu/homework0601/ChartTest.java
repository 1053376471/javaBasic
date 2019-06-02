package com.neuedu.homework0601;

import java.util.Scanner;

public class ChartTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入半径");
        int radius = input.nextInt();
        Chart graphical = new ChartCircle();
        ((ChartCircle) graphical).setRadius(radius);
        ((ChartCircle) graphical).Perimeter();
        ((ChartCircle) graphical).area();
        System.out.println("输入边长");
        int bianchang = input.nextInt();
        Chart graphical1 = new ChartSquare();
        ((ChartSquare) graphical1).setSide(bianchang);
        ((ChartSquare) graphical1).Perimeter();
        ((ChartSquare) graphical1).area();
    }
}

