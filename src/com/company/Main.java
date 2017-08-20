package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int maxNumber=0;
        int numberArray[] = {10,2,3,4,21,5};
        maxNumber = numberArray[0];

        for (int i = 0; i < numberArray.length ; i++) {
            if(numberArray[i] > maxNumber) {
                maxNumber = numberArray[i];
            }
        }

        System.out.println("Największ liczba to: " + maxNumber);



    }
}
