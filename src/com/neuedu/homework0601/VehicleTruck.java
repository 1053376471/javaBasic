package com.neuedu.homework0601;

public class VehicleTruck extends VehicleCar{
    private double payload;

    public double getPayload() {
        return payload;
    }

    public void setPayload(double payload) {
        this.payload = payload;
    }

    VehicleTruck()
    {
        payload=10;
    }
    VehicleTruck(double zaizhong)
    {
        payload=zaizhong;
    }
    VehicleTruck(int zaikeshu,double zaizhong)
    {
        super(zaikeshu);
        payload=zaizhong;
    }
    VehicleTruck(int lun, double zizhong,int zaikeshu,double zaizhong)
    {
        super(lun,zizhong,zaikeshu);
        payload=zaizhong;
    }
    public void showData(){
        System.out.println("轮子"+getWheels()+"个"+"自重"+getWeight()+"t");
        System.out.println("载客人数："+getLoader()+"人");
        System.out.println("载重："+payload+"t");
    }
}
