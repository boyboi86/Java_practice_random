package com.company;

public class Main {

    public static void main(String[] args) {
	// Minimum number java can compute, width of 32
        int MinValue = -2147483648;
    // Maximum number java can compute
        int MaxValue = 2147483647;
    // new int number
        int newValue = 10_000;
    // Minimum byte which is the smallest memory space by default width of 8, apart from int the rest must be in byte
        byte myByteMinValue = -128;
        byte newByteValue = (byte) (myByteMinValue/2);
    //  Minimum byte
        byte myByteMaxValue = 127;
    //  short is twice of a byte but half of int, width of 16
        short maxShortValue = 32767;
        short newShortValue = (short)(maxShortValue/2);
    // long is twice of int width of 64, denoted by the letter L after the number
    // the underscore is a permitted type to seperate numbers for easier view for all numbers
        long maxLongValue = 9_223_372_036_854_775_807L;
        long newLongValue = (long)(maxLongValue/2);
    // Challenge question everything will be convert to type long
        long longValue = 50_000L + 10L * (newByteValue + newShortValue + newValue);
        System.out.println(longValue);
    // If short due to lesser bytes
        short shortValue = (short) (50000 + 10 * (newByteValue + newShortValue + newValue));
        System.out.println(shortValue);
  }
}
