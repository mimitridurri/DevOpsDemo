package ch.zhaw.iwi.devops.romanNumerals;

public class RomanNumeralsConverter {

    public Object toRoman(int input) {
        StringBuilder roman = new StringBuilder();


        for (Numeral numeral : Numeral.values()) {
            if (input >= numeral.arabic) {
                roman.append(numeral.roman);
                input -= numeral.arabic;
            }
        }


        if (input >= 5) {
            roman.append("V") ;
            input -= 5;
            
        }

        for (int index = 0; index < input; index++) {
            roman.append("I");
        }
    
        return roman.toString();
    
    }
    
    private enum Numeral{
        TEN (10, "X"),
        FIVE (5, "V"),
        FOUR (4, "IV");
    
        private final int arabic;
        private final String roman;


        Numeral(int arabic, String roman) {
            this.arabic = arabic;
            this.roman = roman;
        }
    }
}
