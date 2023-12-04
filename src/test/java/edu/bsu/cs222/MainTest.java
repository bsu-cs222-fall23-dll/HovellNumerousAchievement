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

}
