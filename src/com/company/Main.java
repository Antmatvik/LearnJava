package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(System.currentTimeMillis());
        Date date=new Date(System.currentTimeMillis());
        System.out.println(date);
    }
}
