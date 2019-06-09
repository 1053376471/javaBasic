package com.neuedu.homework0607;

public class PizzaHaiXian extends Pizza{
        private String peiLiao;

        public String getPeiliao() {
            return peiLiao;
        }
        public void setPeiliao(String peiliao) {
            this.peiLiao = peiLiao;
        }

        public PizzaHaiXian() {
            super();
        }
        public PizzaHaiXian(int size, int price, String name, String peiLiao) {
            super(name,size,price);
            this.peiLiao = peiLiao;
        }

        public String show(){
            return "名称:"+super.getName()+"价格:"+super.getPrice()+"元"+"大小:"+super.getSize()+"寸"+"配料:"+peiLiao;
        }


    }


