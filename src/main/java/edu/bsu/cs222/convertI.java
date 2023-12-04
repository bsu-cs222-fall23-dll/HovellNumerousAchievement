package edu.bsu.cs222;

public class convertI {
    public String convertAll(int input) {
        String output = "";
        for (int i = 1; i <= input; i++) {
            output = output + ("I");
        }
        return output;

    }

    public int convertIInt(int i) {
        while (i >= 1) i = i - 1;
        return i;
    }
}
