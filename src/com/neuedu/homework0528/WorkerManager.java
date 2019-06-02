package com.neuedu.homework0528;

public class WorkerManager {
    private String name;
    private String sex;
    private String date;
    private float salay;

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

    public float getSalay() {
        return salay;
    }

    public void setSalay(float salay) {
        this.salay = salay;
    }

    public  void computSalay() {
        System.out.println(salay);

    }
}
