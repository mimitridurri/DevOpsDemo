package ch.zhaw.iwi.devops.romanNumerals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralsTest {

    @Test
    public void one() {
        Assertions.assertEquals("I", RomanNumerals.arabicToRoman(1));
    }

}