package javaproject;

import java.util.Scanner;

public class UserInputElseIf {

    public static void main(String args[]) {
        System.out.println("Enter marks...");
        int marks;
        Scanner s = new Scanner(System.in);
        marks = s.nextInt();
        if (marks == 5) {
            System.out.println("Marks is 5");
        } else if (marks == 10) {
            System.out.println("Marks is 10");
        } else if (marks == 15) {
            System.out.println("Marks is 15");
        } else {
            System.out.println("No match");
        }
    }

}
