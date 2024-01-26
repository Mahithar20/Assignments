package TwentyfifthJan;

import java.util.Scanner;

public class MonthsOfYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number from 1 to 12");
        int n = scanner.nextInt();
        switch (n){
            case 1:
                System.out.println("The given month is January");
                break;
            case 2:
                System.out.println("The given month is February");
                break;
            case 3:
                System.out.println("The given month is March");
                break;
            case 4:
                System.out.println("The given month is April");
                break;
            case 5:
                System.out.println("The given month is May");
                break;
            case 6:
                System.out.println("The given month is June");
                break;
            case 7:
                System.out.println("The given month is July");
                break;
            case 8:
                System.out.println("The given month is August");
                break;
            case 9:
                System.out.println("The given month is September");
                break;
            case 10:
                System.out.println("The given month is October");
                break;
            case 11:
                System.out.println("The given month is November");
                break;
            case 12:
                System.out.println("The given month is December");
                break;
            default:
                System.out.println("The given month is invalid");
                break;
        }
    }

}
