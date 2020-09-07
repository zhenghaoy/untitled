package com.demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class hello {
    public static void main(String[] args) {
        System.out.println("hw");
        List list = new ArrayList<String>();
        list.add("ddd");

        System.out.println(add12());
        System.out.println();

        Date date = new Date();
        System.out.println(date);

    }

    private static String add12() {
        return "aaa";
    }
}
