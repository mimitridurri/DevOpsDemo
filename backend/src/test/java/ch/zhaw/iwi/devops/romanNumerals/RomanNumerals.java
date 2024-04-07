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
        //Assertions.assertEquals("IV", romanNumerals.toRoman(4));
        Assertions.assertEquals("V", romanNumerals.toRoman(5));
        Assertions.assertEquals("VI", romanNumerals.toRoman(6));
        Assertions.assertEquals("VII", romanNumerals.toRoman(7));
        Assertions.assertEquals("VIII", romanNumerals.toRoman(8));
    }
}
