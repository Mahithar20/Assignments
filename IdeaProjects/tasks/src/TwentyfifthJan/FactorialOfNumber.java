package TwentyfifthJan;

public class FactorialOfNumber {

        public void factorial(int number){
           int  fact = 1;
            for (int i=1; i<=number; i++){
                fact*= i;
            }
            System.out.println(" Factorial of given number is "+ fact);
        }

}
class FactorialRunner{
     public static void main(String[] args) {

         FactorialOfNumber obj1 = new FactorialOfNumber();
             obj1.factorial(10);

     }
 }