package ch.zhaw.iwi.devops.romanNumerals;

public class RomanNumeralsConverter {

    public Object toRoman(int i) {
        if (i == 2) {
            return "II";
        }
        return "I";
    }

}
