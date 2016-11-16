package com.floaty;

public class Main {

    public static void main(String[] args) {
        int myInt = 5;
	// For floats you need to place "f" after it or place (float) before expression
        float myNewFloat = 5.25f;
        float myAnotherFloat = (float) 5.25;
        float myFloat = 5f;
    // By default java will assume double so to prevent that float has to put "f"
        double myDoubleValue = 5d;
        double myDouble = 5;
    //      for float and double when divided by half will lead to decimal while int will lead to int
        System.out.println("double: " + myDouble);
        System.out.println("float: " + myFloat);
        System.out.println("Int: " + myInt);

        double divideDouble = myDoubleValue/3d;
        float dividFloat = myFloat/3f;
        int divideInt = myInt/3;
//      double is the only one that gives you 16 digits etc 1.6666666666666667 width of 64 (8 bytes)
        System.out.println(divideDouble);
//        float is somehow limited to 1.666666 width of 32 (4 bytes)
        System.out.println(dividFloat);
//        only this output is 1 width of 32 (4 bytes)
        System.out.println(divideInt);

        // create pounds and convert it to kilos
        int pounds = 100;
        float poundToKilos = 0.45359237f;
        System.out.println(pounds * poundToKilos);

    }
}
