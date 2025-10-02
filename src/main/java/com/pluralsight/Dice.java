package com.pluralsight;

public class Dice {
    public int roll(){

        int randomNumber = (int)(Math.random() * 6) + 1;

        return randomNumber;
    }

    public static void main(String[] args) {

       int i = 0;

       while(i<=100){


           i+=1;

           System.out.println("The roll number is: " + new Dice().roll());
       }

    }
}
