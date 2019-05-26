package com.neuedu.test;

public class Test0509 {
    //    用 while 循环，计算 1~200 之间所有 3 的倍数之和。
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while(i< 200){
            if (i % 3 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println("200以内3的倍数之和是："+sum);
    }

}
