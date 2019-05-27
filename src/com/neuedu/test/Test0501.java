package com.neuedu.test;
//打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。
public class Test0501 {
    public static void main(String[] args) {
        for (int i = 100;i<=999;i++){
            int a = i/100;
            int b = i%100/10;
            int c = i%10;
            if (a*a*a+b*b*b+c*c*c==i){
                System.out.println(i);
            }
        }
    }
}