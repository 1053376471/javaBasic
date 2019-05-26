package com.neuedu.test;

import java.util.Scanner;

public class Test0510 {
//    一个整数的各位数字之和能被 9 整除，则该数也能被 9 整除。编程验证给定的整数能否被 9 整除。
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        boolean flag = false;
        int num = 0;
        while(input%10>0){
            num += input%10;
            input = input/10;
            if (num%9==0){
                flag = true;
            }

        }
        System.out.println(flag?"能整除":"不能整除");

    }
}
