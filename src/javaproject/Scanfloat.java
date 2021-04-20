package javaproject;

import java.util.Scanner;

public class Scanfloat {

    public static void main(String args[]) {
        float a;
        System.out.println("Enter float value : ");
        Scanner s = new Scanner(System.in); // create object
        a = s.nextFloat(); // Take integer input and assign to variable
        System.out.println("You entered " + a);
    }

}
