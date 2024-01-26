package SeventeenJan;

import java.util.Scanner;

public class ScannerClass {

        public static void main(String[] args) {
            //inches to meters
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Number of inches");
            float inches = scanner.nextFloat();
            System.out.println("given inches in meter is "+ (0.0254*inches));

            //powers of given number
            System.out.println("Enter a number to find powers of the number");
            int n = scanner.nextInt();
            System.out.println("Squares of the given number is "+ Math. pow(n, 2));
            System.out.println("Cubes of the given number is "+ (n*n*n));
            System.out.println("Fourth power of the given number is "+ (Math. pow(n, 4)));

            long product = n;

            for (int i = 2; i<=63; i++){
                product = n * product;
            }
            System.out.println("100th power of given number is "+ product);

            //Equality of numbers
            System.out.println("Enter 4 numbers");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            if(a == b && b==c && c==d) System.out.println("Given numbers are equal");
            else System.out.println(" Given numbers are not equal");

            //even or odd
            System.out.println("Enter a number");
            int num = scanner.nextInt();
            if(num%2 == 0) System.out.println("Given number is even");
            else System.out.println("Given number is odd");

        }
    }

