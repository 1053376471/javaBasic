package com.neuedu.homework0601;

public class _Rectangle {
    public static String ZC(double width,double height){
        if (width>0&&height>0)
            return "矩形的周长为" +2*(width+height);
        else
            return "长和宽大于0，请重写输入";
    }
}
