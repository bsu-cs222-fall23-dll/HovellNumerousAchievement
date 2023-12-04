package edu.bsu.cs222;

public class convertAll {
    public String convertNumber(int input) {

        int[] allNumbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] allRoman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        String romanOutput = "";
        for (int i = 0; i < allNumbers.length; i++) {
            while (input >= allNumbers[i]) {
                romanOutput = romanOutput + allRoman[i];
                input -= allNumbers[i];
            }
        }

        return romanOutput;
    }
}
