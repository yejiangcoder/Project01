package com.itheima;

import java.io.*;

/**
 * @author yejiang
 * @date 2018/11/23
 */
public class Customer {


    public static final String code = "123";


    public static void main(String[] args) throws Exception {


        System.out.println("hello World");


        File file = new File("dd");


        FileOutputStream fileOutputStream = new FileOutputStream(file);

        PrintWriter printWriter = new PrintWriter(fileOutputStream);


    }


}

