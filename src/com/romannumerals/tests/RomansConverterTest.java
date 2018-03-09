package com.romannumerals.tests;

import com.romannumerals.RomansConverter;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by igor on 09.03.18.
 */
public class RomansConverterTest {
    @Test
    public void testFromIntegerToRoman(){
        RomansConverter romansConverter = new RomansConverter();
        assertEquals(romansConverter.fromArabicRoman(1), "I");
        assertEquals(romansConverter.fromArabicRoman(2), "II");
        assertEquals(romansConverter.fromArabicRoman(3), "III");
        assertEquals(romansConverter.fromArabicRoman(4), "IV");
        assertEquals(romansConverter.fromArabicRoman(5), "V");
        assertEquals(romansConverter.fromArabicRoman(6), "VI");
        assertEquals(romansConverter.fromArabicRoman(7), "VII");
        assertEquals(romansConverter.fromArabicRoman(8), "VIII");
        assertEquals(romansConverter.fromArabicRoman(9), "IX");
        assertEquals(romansConverter.fromArabicRoman(10), "X");
        assertEquals(romansConverter.fromArabicRoman(11), "XI");
        assertEquals(romansConverter.fromArabicRoman(12), "XII");
        assertEquals(romansConverter.fromArabicRoman(13), "XIII");
        assertEquals(romansConverter.fromArabicRoman(14), "XIV");
        assertEquals(romansConverter.fromArabicRoman(15), "XV");
        assertEquals(romansConverter.fromArabicRoman(16), "XVI");
        assertEquals(romansConverter.fromArabicRoman(17), "XVII");
        assertEquals(romansConverter.fromArabicRoman(18), "XVIII");
        assertEquals(romansConverter.fromArabicRoman(19), "XIX");
        assertEquals(romansConverter.fromArabicRoman(20), "XX");
        assertEquals(romansConverter.fromArabicRoman(21), "XXI");
        assertEquals(romansConverter.fromArabicRoman(22), "XXII");
        assertEquals(romansConverter.fromArabicRoman(23), "XXIII");
        assertEquals(romansConverter.fromArabicRoman(24), "XXIV");
        assertEquals(romansConverter.fromArabicRoman(25), "XXV");
        assertEquals(romansConverter.fromArabicRoman(26), "XXVI");
        assertEquals(romansConverter.fromArabicRoman(27), "XXVII");
        assertEquals(romansConverter.fromArabicRoman(28), "XXVIII");
        assertEquals(romansConverter.fromArabicRoman(29), "XXIX");
        assertEquals(romansConverter.fromArabicRoman(30), "XXX");
        assertEquals(romansConverter.fromArabicRoman(31), "XXXI");
        assertEquals(romansConverter.fromArabicRoman(32), "XXXII");
        assertEquals(romansConverter.fromArabicRoman(33), "XXXIII");
        assertEquals(romansConverter.fromArabicRoman(34), "XXXIV");
        assertEquals(romansConverter.fromArabicRoman(35), "XXXV");
        assertEquals(romansConverter.fromArabicRoman(36), "XXXVI");
        assertEquals(romansConverter.fromArabicRoman(37), "XXXVII");
        assertEquals(romansConverter.fromArabicRoman(38), "XXXVIII");
        assertEquals(romansConverter.fromArabicRoman(39), "XXXIX");
        assertEquals(romansConverter.fromArabicRoman(40), "XL");
        assertEquals(romansConverter.fromArabicRoman(41), "XLI");
        assertEquals(romansConverter.fromArabicRoman(42), "XLII");
        assertEquals(romansConverter.fromArabicRoman(43), "XLIII");
        assertEquals(romansConverter.fromArabicRoman(44), "XLIV");
        assertEquals(romansConverter.fromArabicRoman(45), "XLV");
        assertEquals(romansConverter.fromArabicRoman(46), "XLVI");
        assertEquals(romansConverter.fromArabicRoman(47), "XLVII");
        assertEquals(romansConverter.fromArabicRoman(48), "XLVIII");
        assertEquals(romansConverter.fromArabicRoman(49), "XLIX");
        assertEquals(romansConverter.fromArabicRoman(50), "L");
        assertEquals(romansConverter.fromArabicRoman(51), "LI");
        assertEquals(romansConverter.fromArabicRoman(52), "LII");
        assertEquals(romansConverter.fromArabicRoman(53), "LIII");
        assertEquals(romansConverter.fromArabicRoman(54), "LIV");
        assertEquals(romansConverter.fromArabicRoman(55), "LV");
        assertEquals(romansConverter.fromArabicRoman(56), "LVI");
        assertEquals(romansConverter.fromArabicRoman(57), "LVII");
        assertEquals(romansConverter.fromArabicRoman(58), "LVIII");
        assertEquals(romansConverter.fromArabicRoman(59), "LIX");
        assertEquals(romansConverter.fromArabicRoman(60), "LX");
        assertEquals(romansConverter.fromArabicRoman(64), "LXIV");
        assertEquals(romansConverter.fromArabicRoman(68), "LXVIII");
        assertEquals(romansConverter.fromArabicRoman(77), "LXXVII");
        assertEquals(romansConverter.fromArabicRoman(84), "LXXXIV");
        assertEquals(romansConverter.fromArabicRoman(88), "LXXXVIII");
        assertEquals(romansConverter.fromArabicRoman(99), "XCIX");
        assertEquals(romansConverter.fromArabicRoman(107), "CVII");
        assertEquals(romansConverter.fromArabicRoman(119), "CXIX");
        assertEquals(romansConverter.fromArabicRoman(128), "CXXVIII");
        assertEquals(romansConverter.fromArabicRoman(144), "CXLIV");
        assertEquals(romansConverter.fromArabicRoman(184), "CLXXXIV");
        assertEquals(romansConverter.fromArabicRoman(213), "CCXIII");
        assertEquals(romansConverter.fromArabicRoman(256), "CCLVI");
        assertEquals(romansConverter.fromArabicRoman(512), "DXII");
        assertEquals(romansConverter.fromArabicRoman(583), "DLXXXIII");
        assertEquals(romansConverter.fromArabicRoman(613), "DCXIII");
        assertEquals(romansConverter.fromArabicRoman(777), "DCCLXXVII");
        assertEquals(romansConverter.fromArabicRoman(888), "DCCCLXXXVIII");
        assertEquals(romansConverter.fromArabicRoman(999), "CMXCIX");
        assertEquals(romansConverter.fromArabicRoman(1024), "MXXIV");
        assertEquals(romansConverter.fromArabicRoman(1668), "MDCLXVIII");
        assertEquals(romansConverter.fromArabicRoman(1953), "MCMLIII");
        assertEquals(romansConverter.fromArabicRoman(1954), "MCMLIV");
        assertEquals(romansConverter.fromArabicRoman(1981), "MCMLXXXI");
        assertEquals(romansConverter.fromArabicRoman(1989), "MCMLXXXIX");
        assertEquals(romansConverter.fromArabicRoman(1990), "MCMXC");
        assertEquals(romansConverter.fromArabicRoman(2010), "MMX");
        assertEquals(romansConverter.fromArabicRoman(2018), "MMXVIII");
        assertEquals(romansConverter.fromArabicRoman(2048), "MMXLVIII");
        assertEquals(romansConverter.fromArabicRoman(3999), "MMMCMXCIX");
    }

    @Test
    public void testFromRomans(){
        RomansConverter romansConverter = new RomansConverter();
        assertEquals(4, romansConverter.fromRomanToArabic("IV"));
        assertEquals(4, romansConverter.fromRomanToArabic("IIII"));
        assertEquals(5, romansConverter.fromRomanToArabic("V"));
        assertEquals(10, romansConverter.fromRomanToArabic("X"));
        assertEquals(50, romansConverter.fromRomanToArabic("L"));
        assertEquals(100, romansConverter.fromRomanToArabic("C"));
        assertEquals(500, romansConverter.fromRomanToArabic("D"));
        assertEquals(1000, romansConverter.fromRomanToArabic("M"));
        assertEquals(60, romansConverter.fromRomanToArabic("LX"));
        assertEquals(64, romansConverter.fromRomanToArabic("LXIV"));
        assertEquals(68, romansConverter.fromRomanToArabic("LXVIII"));
        assertEquals(77, romansConverter.fromRomanToArabic("LXXVII"));
        assertEquals(84, romansConverter.fromRomanToArabic("LXXXIV"));
        assertEquals(88, romansConverter.fromRomanToArabic("LXXXVIII"));
        assertEquals(99, romansConverter.fromRomanToArabic("XCIX"));
        assertEquals(107, romansConverter.fromRomanToArabic("CVII"));
        assertEquals(119, romansConverter.fromRomanToArabic("CXIX"));
        assertEquals(128, romansConverter.fromRomanToArabic("CXXVIII"));
        assertEquals(144, romansConverter.fromRomanToArabic("CXLIV"));
        assertEquals(184, romansConverter.fromRomanToArabic("CLXXXIV"));
        assertEquals(213, romansConverter.fromRomanToArabic("CCXIII"));
        assertEquals(256, romansConverter.fromRomanToArabic("CCLVI"));
        assertEquals(512, romansConverter.fromRomanToArabic("DXII"));
        assertEquals(537, romansConverter.fromRomanToArabic("DXXXVII"));
        assertEquals(583, romansConverter.fromRomanToArabic("DLXXXIII"));
        assertEquals(613, romansConverter.fromRomanToArabic("DCXIII"));
        assertEquals(666, romansConverter.fromRomanToArabic("DCLXVI"));
        assertEquals(777, romansConverter.fromRomanToArabic("DCCLXXVII"));
        assertEquals(888, romansConverter.fromRomanToArabic("DCCCLXXXVIII"));
        assertEquals(999, romansConverter.fromRomanToArabic("CMXCIX"));
        assertEquals(1024, romansConverter.fromRomanToArabic("MXXIV"));
        assertEquals(1668, romansConverter.fromRomanToArabic("MDCLXVIII"));
        assertEquals(1953, romansConverter.fromRomanToArabic("MCMLIII"));
        assertEquals(1954, romansConverter.fromRomanToArabic("MCMLIV"));
        assertEquals(1981, romansConverter.fromRomanToArabic("MCMLXXXI"));
        assertEquals(1989, romansConverter.fromRomanToArabic("MCMLXXXIX"));
        assertEquals(1990, romansConverter.fromRomanToArabic("MCMXC"));
        assertEquals(2010, romansConverter.fromRomanToArabic("MMX"));
        assertEquals(2018, romansConverter.fromRomanToArabic("MMXVIII"));
        assertEquals(2048, romansConverter.fromRomanToArabic("MMXLVIII"));
        assertEquals(3999, romansConverter.fromRomanToArabic("MMMCMXCIX"));
    }
}