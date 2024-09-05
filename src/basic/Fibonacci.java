package basic;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        ReverseANumber reverseANumber = new ReverseANumber();
        System.out.println("Fibonacci Example.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter N:");
        int x = scanner.nextInt();
        int prev = 0, current =  1;

        printFibonacci(prev, current, x, 0);

    }

    private static void printFibonacci(int prev, int current, int x, int count) {

        if(count >= x){
            return;
        }
        System.out.print(prev +" ,");
        int temp = current;
        current = prev;
        prev = prev+ temp;
        count++;

        printFibonacci(prev, current, x, count);

    }
}
