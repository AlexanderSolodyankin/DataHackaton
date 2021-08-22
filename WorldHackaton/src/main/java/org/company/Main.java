package org.company;

import java.util.Date;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random ran = new Random();
        new java.sql.Date(new Date().getTime());
        System.out.println(new Date(System.currentTimeMillis() - ran.nextInt(90000000)));
        System.out.println(new java.sql.Date(new Date().getTime()));
    }
}
