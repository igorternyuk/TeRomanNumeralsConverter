package com.romannumerals;

public class Main {

    public static void main(String[] args) {
	// write your code here
        RomansConverter converter = new RomansConverter();
        for(int i = 1; i <= 500; ++i)
            System.out.println(i + " is " + converter.fromArabicRoman(i));
    }
}
