package ch.zhaw.iwi.devops.romanNumerals;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class RomanNumeralsKataTest {
    @Test
    public void convertToRoman() {
        assertEquals("I", RomanNumeralsKata.toRoman(1));
    }
}
