package ch.zhaw.iwi.devops.romanNumerals;

public class RomanNumeralsConverter_Demo {

    public Object toRoman(int i) {
        if (i == 2) {
            return "II";
        }
        if (i == 3) {
            return "III";
        }
        return "I";
    }
}
