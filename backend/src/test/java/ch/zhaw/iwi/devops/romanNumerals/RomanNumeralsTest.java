package ch.zhaw.iwi.devops.romanNumerals;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RomanNumeralsTest {
    
    @Test
    public void romanNumerals1() {
        RomanNumeralsConverter romanNumerals = new RomanNumeralsConverter();

        Assertions.assertEquals("I", romanNumerals.toRoman(1));
        Assertions.assertEquals("II", romanNumerals.toRoman(2));
        Assertions.assertEquals("III", romanNumerals.toRoman(3));
        Assertions.assertEquals("IV", romanNumerals.toRoman(4));
        Assertions.assertEquals("V", romanNumerals.toRoman(5));
        Assertions.assertEquals("VI", romanNumerals.toRoman(6));
        Assertions.assertEquals("VII", romanNumerals.toRoman(7));
        Assertions.assertEquals("VIII", romanNumerals.toRoman(8));
        Assertions.assertEquals("IX", romanNumerals.toRoman(9));
        Assertions.assertEquals("X", romanNumerals.toRoman(10));
        // Adding more test cases for fun
        Assertions.assertEquals("L", romanNumerals.toRoman(50));
        Assertions.assertEquals("C", romanNumerals.toRoman(100));
        Assertions.assertEquals("CI", romanNumerals.toRoman(101));

        Assertions.assertEquals("XI", romanNumerals.toRoman(11));
        Assertions.assertEquals("XXX", romanNumerals.toRoman(30));

        
        
    }
}
