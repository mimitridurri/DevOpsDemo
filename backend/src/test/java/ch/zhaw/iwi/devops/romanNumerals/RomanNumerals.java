package ch.zhaw.iwi.devops.romanNumerals;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RomanNumerals {
    
    @Test
    public void romanNumerals1() {
        RomanNumeralsConverter romanNumerals = new RomanNumeralsConverter();

        Assertions.assertEquals("I", romanNumerals.toRoman(1));
        Assertions.assertEquals("II", romanNumerals.toRoman(2));
        Assertions.assertEquals("III", romanNumerals.toRoman(3));
        Assertions.assertEquals("IV", romanNumerals.toRoman(4));
    }
}
