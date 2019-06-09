package com.neuedu.homework0607;


import java.util.Scanner;

public class PizzaGongChang {


    public static Pizza getPizza(int order) {
            Scanner input = new Scanner(System.in);
            Pizza p = null;
            if (order == 1) {
                System.out.println("请输入培根克数:");
                int keNum = input.nextInt();
                System.out.println("请输入披萨大小:");
                int size = input.nextInt();
                System.out.println("请输入披萨价格:");
                int price = input.nextInt();
                p = new PizzaPeiGen(size, price, "培根披萨",keNum);
            }
            if (order == 2) {
                System.out.println("请输入配料信息:");
                String peiLiao = input.next();
                System.out.println("请输入披萨大小:");
                int size = input.nextInt();
                System.out.println("请输入披萨价格:");
                int price = input.nextInt();
                p = new PizzaHaiXian(size, price, "海鲜披萨", peiLiao);
            }
            return p;

        }
    }


