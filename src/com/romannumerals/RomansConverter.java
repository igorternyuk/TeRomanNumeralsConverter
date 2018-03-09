package com.romannumerals;

import java.util.Map;
import java.util.HashMap;

/**
 * Created by igor on 09.03.18.
 */
public class RomansConverter {
    private static final int ROMANS_LIMIT = 3999;
    private static final Map<Character, Integer> ROMAN_NUMERALS = createBaseNumerals();
    private static final  String[] THOUSANDS = {"","M", "MM", "MMM"};
    private static final  String[] HUNDREDS = {"","C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    private static final  String[] TENS = {"","X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    private static final  String[] UNITS = {"","I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

    private static Map<Character,Integer> createBaseNumerals() {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        return map;
    }

    public int fromRomanToArabic(final String romanNumeral){
        int result = 0;
        int previousValue = 0;
        for(char ch: romanNumeral.toCharArray()){
            Integer currentValue = ROMAN_NUMERALS.get(ch);
            if(currentValue == null){
                throw new IllegalArgumentException("Invalid numeral");
            }
            if(currentValue < previousValue){
                result += previousValue;
                previousValue = currentValue;
            } else if(currentValue > previousValue){
                if(previousValue == 0){
                    previousValue = currentValue;
                } else {
                    result += currentValue - previousValue;
                    previousValue = 0;
                }
            } else {
                result += previousValue + currentValue;
                previousValue = 0;
            }
        }
        return result + previousValue;
    }

    public String fromArabicRoman(final int number){
        if(number > 0 && number <= ROMANS_LIMIT) {
            return THOUSANDS[number / 1000] + HUNDREDS[(number % 1000) / 100] + TENS[(number % 100) / 10] +
                    UNITS[number % 10];
        } else {
            throw new IllegalArgumentException("Number must be less or equals to 3999");
        }
    }
}
