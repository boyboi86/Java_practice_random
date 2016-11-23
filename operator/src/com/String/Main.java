package com.String;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double first = 20;
        double second = 80;
        double outcome = ((first + second) * 25)%40;
        if(outcome <= 20 ){
            System.out.println("Total is out of limit");
        }
    }
}
