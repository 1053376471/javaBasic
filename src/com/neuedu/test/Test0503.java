package com.neuedu.test;

import java.util.Scanner;

public class Test0503 {
    //判断一个数是不是回文数
    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("请输入一个五位数");
            int num = input.nextInt();
            while (num % 10 > 0) {
                int i = num / 10000;
                int j = num % 10000 / 1000;
//            int l = num % 1000 / 100;
                int m = num % 100 / 10;
                int n = num % 10;
                if (i == n && j == m) {
                    System.out.println("是回文数");
                    break;
                } else {
                    System.out.println(2);
                    break;
                }
            }
        }
    }
}