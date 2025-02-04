package com.javaeasy.junit;

public class Calculator {

    // public static int add(int a, int b){
    //     return a+b;
    // }

    public static int add(int ... numbers){
        int sum = 0;
        for (int num : numbers) {
            sum +=num;
        }
        return sum;
    }
    // public static int mult(int a, int b){
    //     return a*b;
    // }
    public static int mult(int ... numbers){
        int sum = 1;
        for (int num : numbers) {
            sum *=num;
        }
        return sum;
    }


}
