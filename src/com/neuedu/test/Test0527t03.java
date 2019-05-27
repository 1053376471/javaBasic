package com.neuedu.test;

import java.util.Scanner;

public class Test0527t03 {
    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("请输入半径");
            int a = input.nextInt();
            Test0527t02 test = new Test0527t02();
            test.radius(a);
        }
    }
}