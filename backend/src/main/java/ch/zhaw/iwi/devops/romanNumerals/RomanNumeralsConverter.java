package ch.zhaw.iwi.devops.romanNumerals;

public class RomanNumeralsConverter {

    public Object toRoman(int input) {
        StringBuilder roman = new StringBuilder();

        for (Numeral numeral : Numeral.values()) {
            while (input >= numeral.arabic) {
                roman.append(numeral.roman);
                input -= numeral.arabic;
            }
        }
    
        return roman.toString();
    }
    
    private enum Numeral{
        HUNDRED(100, "C"),
        FIFTY(50, "L"),
        TEN (10, "X"),
        NINE (9, "IX"),
        FIVE (5, "V"),
        FOUR (4, "IV"),
        ONE (1, "I");
    
        private final int arabic;
        private final String roman;


        Numeral(int arabic, String roman) {
            this.arabic = arabic;
            this.roman = roman;
        }
    }
}
