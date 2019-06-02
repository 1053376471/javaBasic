package com.neuedu.homework0601;

public class VehicleCar extends Vehicle {
    private int loader;

    VehicleCar()
    {
        loader=4;
    }
    VehicleCar(int zaikeshu)
    {
        loader=zaikeshu;
    }
    VehicleCar(int lun, double zizhong,int zaikeshu)
    {
        super(lun,zizhong);
        loader=zaikeshu;
    }



    public int getLoader() {
        return loader;
    }
    public void setLoader(int loader) {
        this.loader = loader;
    }
    public void showData(){
        System.out.println("轮子"+getWheels()+"个"+"自重"+getWeight()+"t");
        System.out.println("载客人数："+loader+"人");
    }

}
