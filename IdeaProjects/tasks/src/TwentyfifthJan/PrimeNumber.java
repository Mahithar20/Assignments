package TwentyfifthJan;

public class PrimeNumber {

    public void primeNumberCheck(int num){
        int count = 0;
        for(int i = 2; i<=num; i++){
            if(num%i == 0){
                count++;
            }
        }
        if(count > 1){
            System.out.println("The given number is  not Prime Number");

}
        else System.out.println("The given number is  a Prime Number");
}
}

class PrimeNumberRunner {


    public static void main(String[] args) {
    PrimeNumber obj = new PrimeNumber();
    obj.primeNumberCheck(47);
    }
}

