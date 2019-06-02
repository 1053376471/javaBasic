package com.neuedu.homework0528;

public class Point {

    public int x;
    public int y;
    public Point(){

    }
     public Point(int x0,int y0){
        x=x0;
        y=y0;

    }
    public void Point(int dx,int dy){
        x+=dx;
        y+=dy;
    }
    public String toString() {
        return "("+x+","+y+")";

    }

}
