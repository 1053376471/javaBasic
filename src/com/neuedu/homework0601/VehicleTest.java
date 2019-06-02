package com.neuedu.homework0601;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(4,2);
        System.out.println("汽车A有"+vehicle.getWheels()+"个轮子,它的重量是"+vehicle.getWeight()+"吨");

        VehicleCar vehicleCar = new VehicleCar(4,2,3);
        System.out.println("汽车B有"+vehicleCar.getWheels()+"个轮子,它的重量是"+vehicleCar.getWeight()+"吨,能载"+vehicleCar.getLoader()+"个人");

        VehicleTruck vehicleTruck = new VehicleTruck(4,3,2,4);
        System.out.println("汽车C有"+vehicleTruck.getWheels()+"个轮子,它的重量是"+vehicleTruck.getWeight()+"吨,能载"+vehicleTruck.getLoader()+"个人,能装"+vehicleTruck.getPayload()+"吨货");

    }
}
