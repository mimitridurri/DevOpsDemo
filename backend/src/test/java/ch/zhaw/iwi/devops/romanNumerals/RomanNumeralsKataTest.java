package ch.zhaw.iwi.devops.romanNumerals;

import org.junit.jupiter.api.Test;

public class RomanNumeralsKataTest {
    @Test
    public void convertToRoman() {
        assertThat(RomanNumeralsKata.toRoman(1)).isEqualTo("I");
}
