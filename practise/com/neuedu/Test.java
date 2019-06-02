package com.neuedu;

public class Test {
    public static void main(String[] args) {
        /*
         * 冒泡排序
         */
        int[] arr = {11, 3, 45, 21, 99, 1};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = 0;
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        for (int a : arr
        ) {
            System.out.println(a);
        }
    }
//    public String to;


}

