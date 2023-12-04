package edu.bsu.cs222;

public class convertM {
    public String convertMString(int i) {
        String output = "";
        while (i >= 1000) {
            output = output + "M";
            i = i - 1000;
        }

        return output;
    }

    public int convertMInt(int i) {
        while (i >= 1000) i = i - 1000;
        return i;
    }
}
