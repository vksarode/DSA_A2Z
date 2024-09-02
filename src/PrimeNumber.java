import patterns.Pattern;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PrimeNumber {
    public static void main(String[] args) {
        PrimeNumber primeNumber = new PrimeNumber();
        System.out.println("PrimeNumber.");

        Pattern p = new Pattern();
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter N:");
        long n = scanner.nextLong();

        primeNumber.isPrimeNumber(n);
    }

    private void isPrimeNumber( long n) {

       int count =0;
        Set<Integer> set = new TreeSet<>();
        set.add(1);
        for(int i =1; i * i <= n ; i++){
            if(n%i == 0){
                count++;
                set.add(i);
                if(n/i != i){
                    count++;
                    set.add((int)n/i);
                }
                if(count > 2)
                    break;
            }
        }

        if(count ==2){
            System.out.println("The number "+ n +" is prime");
        }else {
            System.out.println("The number "+ n +" is not prime");
        }
        System.out.println(set);
    }
}
