package ch.zhaw.iwi.devops.romanNumerals;

public class RomanNumeralsConverter {

    public Object toRoman(int i) {
        StringBuilder roman = new StringBuilder();

        if (i >= 10) {
            roman.append("X");
            i -= 10;
        }

        if (i >= 5) {
            roman.append("V") ;
            i -= 5;
            
        }

        for (int index = 0; index < i; index++) {
            roman.append("I");
        }
    
        return roman.toString();
    
    }

}
