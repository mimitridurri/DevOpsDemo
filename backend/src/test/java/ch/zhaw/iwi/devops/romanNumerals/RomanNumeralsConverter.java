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

        for (int index = 0; index < input; index++) {
            roman.append("I");
        }
    
        return roman.toString();
    
    }
    
    private enum Numeral{
        TEN (10, "X"),
        NINE (9, "IX"),
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
