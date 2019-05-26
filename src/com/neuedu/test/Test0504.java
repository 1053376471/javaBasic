package com.neuedu.test;

public class Test0504 {
    public static void main(String[] args){
        //计算1-100间的奇数和偶数和
            int a=0;
            for (int even=2;even<=100;even=even+2){
                a=a+even;
            }
            System.out.println("偶数和为："+a);
            for (int odd=1;odd<=100;odd=odd+2){
                a=a+odd;
            }
            System.out.println("奇数和为："+a);
        }
    }


