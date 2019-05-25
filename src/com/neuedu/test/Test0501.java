package com.neuedu.test;

import java.util.Scanner;
//打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。
public class Test0501 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int x = i / 100; //获得百位数
            int y = (i % 100) / 10; //获得十位数
            int z = i - x * 100 - y * 10; //获得个位数
            int tempInt = x * x * x + y * y * y + z * z * z;
            if (tempInt == i) { //相等则为水仙花数
                System.out.println(" " + i); //输出水仙花数
            }
        }
    }
}