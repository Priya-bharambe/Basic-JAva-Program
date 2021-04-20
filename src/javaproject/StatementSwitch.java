package javaproject;

public class StatementSwitch {

    public static void main(String args[]) {
        int age = 20;
        switch (age) {
            case 10:
                System.out.println("Age is 10");
                break;
            case 15:
                System.out.println("Age is 15");
                break;
            case 20:
                System.out.println("Age is 20");
                break;
            case 25:
                System.out.println("Age is 25");
                break;
            default:
                System.out.println("No match");
        }
    }

}
