import java.util.Scanner;

public class FirstDataStructure {
    public static void main(String[] args)
    {
//        for(int i=0;i<5;i++){
//            System.out.print("* ");
//        }
        int[] a
                = new int[5]; // declaration and instantiation



        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements in an array with length 5");
        for(int i = 0; i< a.length; i++){
            a[i] = scanner.nextInt();
        }
//        a[0] = 10; // initialization
//        a[1] = 20;
//        a[2] = 70;
//        a[3] = 40;
//        a[4] = 50;
//        // traversing array
        for (int i = 0; i < a.length;
             i++) // length is the property of array
            if(a[i]%2 == 0)
                System.out.println(a[i]+ "  is an even number");
            else
                System.out.println(a[i]+ "  is an odd number");
    }
}
