package edu.bsu.cs222;

public class convertM {
    public String convertAll(int i) {
        String output = "";
        while (i >= 1000) {
            output = output + "M";
            i = i - 1000;
        }

        return output;
    }
}
