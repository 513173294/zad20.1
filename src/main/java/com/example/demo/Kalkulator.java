package com.example.demo;

public class Kalkulator {

    public int calculator(int max) {

        int sum = 0;

        for (int i = 0; i < max; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }

        return sum;
    }

}
