package com.neuedu.homework0601;

import java.util.Scanner;

public class GuiGuTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入一个数");
        int num = input.nextInt();
        GuiGu guiGu = new GuiGu();
        guiGu.setNnum(num);
        guiGu.guigu();
    }
}

