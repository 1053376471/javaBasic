package com.neuedu.test;

import java.util.Scanner;

public class Test0503 {
   //判断一个数是不是回文数
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入一个五位数");
        int a=input.nextInt();
        int b=a%10;//个位数
        int c=(a%100-b)/10;//十位数
        int d=(a/100)%10;//百位数
        int e=(a/1000)%10;//千位数
        int f=a/10000;//万位数
        if (a<10000||a>99999){
            System.out.println("请输入正确的五位数字");
        }else if (b==f&&c==e){
            System.out.println("是回文数");
        }else {
            System.out.println("不是回文数");
        }
    }
}
