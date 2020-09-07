package com.demo;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author zhy
 * @date 2020/9/7-14:29
 **/
public class TemplatesTest {

    //prsf
    private static final int NUX = 1;
    //psf
    public static final double GG = 1.1;
    //psfi
    public static final int dfd = 2;
    //psfs
    public static final String dd = "aa";



    public static void main(String[] args) {
        System.out.println("helloworld!");
        System.out.println("TemplatesTest.main");
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("args = " + args);
        int num1 = 10;
        System.out.println("num1 = " + num1);
        System.out.println(num1);
        System.out.println("aaa");

        String[] arr = new String[]{"aa","bb","cc"};
        //fori
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //iter
        for (String s : arr) {
            System.out.println(s);
        }
        //itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //list.for
        ArrayList list = new ArrayList();
        list.add(12);
        list.add(23);
        list.add(34);

        for (Object o : list) {

        }
        //list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //list.forr
        for (int i = list.size() - 1; i >= 0; i--) {

        }


    }

    public void method(){
        System.out.println("TemplatesTest.method");
        ArrayList list = new ArrayList();
        list.add(12);
        list.add(23);
        list.add(34);

        //ifn
        if (list == null) {
            System.out.println("aa");
        }
        //inn
        if (list != null) {

        }
        //xxx.nn  / xxx.null
        if (list != null) {

        }
        // xxx.null
        if (list == null) {

        }


    }
}
