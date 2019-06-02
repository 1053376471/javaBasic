package com.neuedu.homework0601;

public class Vehicle {
    private int wheels;
    private double weight;
    Vehicle()
    {
        weight=1;wheels=4;
    }
    Vehicle(int lun, double zizhong)
    {
        wheels=lun;
        weight=zizhong;
    }

    public int getWheels() {
        return wheels;
    }
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void showData(){
        System.out.println("轮子"+wheels+"个，"+"自重"+weight+"t");
    }

}

