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

}
