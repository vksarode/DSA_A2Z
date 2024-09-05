package basic;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        ReverseANumber reverseANumber = new ReverseANumber();
        System.out.println("ReverseANumber Example.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter N:");
        int x = scanner.nextInt();

        reverseANumber.reverseANumber(x);
    }

    private int reverseANumber(int x) {
        long reverseNumber  =  0;
        long temp = x;

        long num = 0;
        if(x < 0){
            num = 0 - (x);
        }else{
            num = x;
        }

        while (num > 0){
            reverseNumber = reverseNumber*10 + num%10;
            num = num / 10;
        }
        if(x < 0){
            reverseNumber = 0 - (reverseNumber);
        }

        if(reverseNumber > Integer.MAX_VALUE){
            reverseNumber = 0;
        }
        System.out.println("reverse number of "+ temp + " is " + reverseNumber);
        return (int)reverseNumber;
    }
}
