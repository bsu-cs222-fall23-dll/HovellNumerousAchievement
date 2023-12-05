package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void test3531() {
        convertAll convert = new convertAll();
        String testNum = convert.convertNumber(3531);
        Assertions.assertEquals(testNum, "MMMDXXXI");
    }

    @Test
    public void test1() {
        convertAll convert = new convertAll();
        String testNum = convert.convertNumber(1);
        Assertions.assertEquals(testNum, "I");
    }

    @Test
    public void test10() {
        convertAll convert = new convertAll();
        String testNum = convert.convertNumber(10);
        Assertions.assertEquals(testNum, "X");
    }

    @Test
    public void test95() {
        convertAll convert = new convertAll();
        String testNum = convert.convertNumber(95);
        Assertions.assertEquals(testNum, "XCV");
    }

    @Test
    public void test555() {
        convertAll convert = new convertAll();
        String testNum = convert.convertNumber(555);
        Assertions.assertEquals(testNum, "DLV");
    }

    @Test
    public void testArrays() {
        convertAll convert = new convertAll();
        int[] allNumbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] allRoman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < allNumbers.length; i++) {
            String testNum = convert.convertNumber(allNumbers[i]);
            Assertions.assertEquals(testNum, allRoman[i]);
        }
    }

    @Test
    public void test999() {
        convertAll convert = new convertAll();
        String testNum = convert.convertNumber(999);
        Assertions.assertEquals(testNum, "CMXCIX");
    }

}
