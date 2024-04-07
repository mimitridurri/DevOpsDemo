package ch.zhaw.iwi.devops.romanNumerals;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;

public class RomanNumeralsTest {
 
    @Test
    public void one() {
      Assert.assertEquals("1", "I", RomanNumerals.arabicToRoman(1));
    }
   
  }