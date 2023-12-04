package edu.bsu.cs222;

public class Main {
    public static void main(String[] args) {

        int startingNumber = 2000;
        convertM makeM = new convertM();

        String takeM = makeM.converttoMString(startingNumber);
        System.out.println(takeM);


    }
}