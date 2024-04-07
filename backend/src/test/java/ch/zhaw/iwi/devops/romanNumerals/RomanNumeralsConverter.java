package ch.zhaw.iwi.devops.romanNumerals;

public class RomanNumeralsConverter {

    public Object toRoman(int i) {
        StringBuilder roman = new StringBuilder();

        if (i == 5) {
            return "V";
            
        }

        for (int index = 0; index < i; index++) {
            roman.append("I");
        }
    
        return roman.toString();
    
    }

}
