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
    public void testConvertToV() {
        convertV convert = new convertV();
        String testNum = convert.convertAll(5);
        Assertions.assertEquals(testNum, "V");
    }

    @Test
    public void testTakeOutM() {
        convertM convert = new convertM();
        String testNum = convert.converttoMString(2000);
        Assertions.assertEquals(testNum, "MM");
    }

    @Test
    public void testMNumber() {
        convertM convert = new convertM();
        int testNum = convert.converttoMInt(2000);
        Assertions.assertEquals(testNum, 0);
    }

}
