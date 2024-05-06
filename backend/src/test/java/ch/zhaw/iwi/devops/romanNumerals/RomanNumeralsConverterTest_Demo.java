package ch.zhaw.iwi.devops.romanNumerals;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RomanNumeralsConverterTest_Demo {
    
    @Test
    public void RomanNumeralsConverterTest() {
        RomanNumeralsConverter_Demo romanNumerals = new RomanNumeralsConverter_Demo();

        Assertions.assertEquals("I", romanNumerals.toRoman(1));
        Assertions.assertEquals("II", romanNumerals.toRoman(2));
        Assertions.assertEquals("III", romanNumerals.toRoman(3));


    }

}
