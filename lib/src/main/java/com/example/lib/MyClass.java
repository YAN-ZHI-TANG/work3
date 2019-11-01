package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String[]args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("身高(公尺)");
        int x= sc.nextInt();
        System.out.println("體重");
        int y = sc.nextInt();
        System.out.println("BMI=  "+y/(x*2));
    }
}