package com.Char;

public class Main {

    public static void main(String[] args) {
	// char width is 16 (2 bytes) the below is UTF8 encode otherwise only single char allow
    //  instead of writing U+00A9 use \u00A9
        char copyright = '\u00A9';
        char onlyOne = 'h';
        System.out.println(copyright);
        System.out.println(onlyOne);
    //   boolean type either true or false
        boolean truthy = true;
        boolean falsy = false;
        System.out.println(truthy);
        System.out.println(falsy);
    //  for unicode instead of writing U+00AE write \u00AE
        char rights = '\u00AE';
        System.out.println(rights);
    }
}
