package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void testAllNumber() {
        convertAll convert = new convertAll();
        String testNum = convert.convertNumber(3531);
        Assertions.assertEquals(testNum, "MMMDXXXI");
    }

}
