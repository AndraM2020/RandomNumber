package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        int min = 0;
        int max = 100;
        System.out.println("Random number between "+min+" to "+max+ ":");
        int a = (int)(Math.random()*(max-min+1)+min);
        System.out.println(a);
    }
}
