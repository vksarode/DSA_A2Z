package basic;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println("Factorial Example");

        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter N:");
        int n = scanner.nextInt();

        int fact = factorial.fact(n);
        System.out.println("factorial of "+ n +" is:"+ fact);
    }

    private  int fact(int n) {
        if(n<=0){
            return 0;
        }
        if(n==1){
         return 1;
        }
        return n * fact(n-1);
    }
}
