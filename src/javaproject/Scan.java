package javaproject;

import java.util.Scanner;

public class Scan {

    public static void main(String args[]) {
        int a;
        System.out.println("Enter integer value : ");
        Scanner s = new Scanner(System.in); // create object
        a = s.nextInt(); // Take integer input and assign to variable
        System.out.println("You entered " + a);
    }

}
