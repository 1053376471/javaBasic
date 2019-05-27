package com.neuedu.test;
//定义长方形类，含：
//  特征：宽、高（整型）；
//  方法：求周长、面积；
//  方法3个：（1）无参——宽、高默认值为1；（2）1个参数——宽、高均为参数值；（3）2个参数——宽、高各为参数值。
//并对其进行测试
public class Test0527t01 {
    public static void main(String[] args) {
        //长方形无参
        System.out.println("无参的长方形");
        Test0527t01 wucan=new Test0527t01();
        wucan.changfangxing1();
        //长方形一个参数
        System.out.println("一个参的长方形");
        Test0527t01 yigecanshu=new Test0527t01();
        yigecanshu.changfangxing2(4);
        //长方形俩个参数
        System.out.println("两个参的长方形");
        Test0527t01 liagecanshu=new Test0527t01();
        liagecanshu.changfangxing3(5,6);
    }
//无参
    private void changfangxing1() {
        int width=1;
        int height=1;
        System.out.println("周长为："+(width+height)*2);
        System.out.println("面积为："+width*height);
    }
//    一个参数
    public void changfangxing2(int a){
        int  width=a;
        int  height=a;
        System.out.println("周长为："+(width+height)*2);
        System.out.println("面积为："+width*height);
    }
//    两个参数
    public  void    changfangxing3(int  b,int   c){
        int  width=b;
        int  height=c;
        System.out.println("周长为："+(width+height)*2);
        System.out.println("面积为："+width*height);
    }
}
