package com.pluralsight;

public class App {
    public static void main(String[] args) {
        Dice dice = new Dice();

        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;

        for (int i = 1; i <= 100; i++) {
            int roll1 = dice.roll();
            int roll2 = dice.roll();

            int sum = roll1 + roll2;
            System.out.printf("Roll %d: Dice 1 Value: %d | Dice 2 Value: %d | Sum: %d\n", i, roll1, roll2, sum);

            switch (sum) {
                case 2:
                    twoCounter++;
                    break;
                case 4:
                    fourCounter++;
                    break;
                case 6:
                    sixCounter++;
                    break;
                case 7:
                    sevenCounter++;
                    break;
            }

        }

        System.out.println("Count of two: " + twoCounter);
        System.out.println("Count of four: " + fourCounter);
        System.out.println("Count of six: " + sixCounter);
        System.out.println("Count of seven: " + sevenCounter);

    }
}