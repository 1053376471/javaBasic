package com.neuedu.homework0601;

public class _Triangle extends _Shape {
    public static String zc(double side1, double side2, double side3) {
        if ((side1 + side2) > side3 && (side2 + side3) > side1 && (side1 + side3) > side2) {
            return "三角形的周长为：" + (side1+side2+side3);

        }else
            return "三边无法组成三角形，请重写输入";

    }
}
