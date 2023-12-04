package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void testConvertToI() {
        convertI convert = new convertI();
        String testNum = convert.convertAll(3);
        Assertions.assertEquals(testNum,"III");
    }

    @Test
    public void testConvertToINumber() {
        convertI convert = new convertI();
        int testNum = convert.convertIInt(3);
        Assertions.assertEquals(testNum,0);
    }

    @Test
    public void testConvertToV() {
        convertV convert = new convertV();
        String testNum = convert.convertAll(5);
        Assertions.assertEquals(testNum, "V");
    }

    @Test
    public void testTakeOutM() {
        convertM convert = new convertM();
        String testNum = convert.convertMString(2000);
        Assertions.assertEquals(testNum, "MM");
    }

    @Test
    public void testMNumber() {
        convertM convert = new convertM();
        int testNum = convert.convertMInt(2000);
        Assertions.assertEquals(testNum, 0);
    }

    @Test
    public void testAllNumber() {
        convertAll convert = new convertAll();
        String testNum = convert.convertNumber(2000);
        Assertions.assertEquals(testNum, "MM");
    }

}
