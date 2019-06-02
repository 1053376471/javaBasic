package com.neuedu.homework0528;

public class WorkerSalesman {
    private String name;
    private String sex;
    private String date;
    private double zi;
    private float ti;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getZi() {
        return zi;
    }

    public void setZi(double zi) {
        this.zi = zi;
    }

    public double getTi() {
        return ti;
    }

    public void setTi(float ti) {
        this.ti = ti;
    }

    public void computSalay() {
        System.out.println(zi+ti);
    }
}
