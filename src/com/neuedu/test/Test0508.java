package com.neuedu.test;

import java.util.Scanner;

public class Test0508 {
    //题目：利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下 的用C表示。
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int grade=input.nextInt();
        if (grade>=90&&grade<=100){
            System.out.println("A");
        }else  if (grade>=60&&grade<=89){
            System.out.println("B");
        }else if (grade>=0&&grade<60){
            System.out.println("C");
        }else{
            System.out.println("成绩输入无效，请重新输入");
        }
    }
}
