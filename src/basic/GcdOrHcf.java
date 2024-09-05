package basic;

import java.util.Scanner;

/**
 * @author Vijaya Kumar Sarode
 */

public class GcdOrHcf {
    public static void main(String[] args) {
        GcdOrHcf gcdOrHcf = new GcdOrHcf();
        System.out.println("GcdOrHcf Example.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter N:");
        long n = scanner.nextLong();
        System.out.print("please enter M:");
        long m = scanner.nextLong();
//        gcdOrHcf.printGcdOrHcf(n, m);
        gcdOrHcf.printGcdOrHcfEucludian(n,m);
    }


    private void printGcdOrHcf(long n, long m) {
        long min = Math.min(n, m);
        long max = Math.max(n, m);
        long gcd = 1;
        for (long i = min; i > 0; i--) {
            if (max % i == 0 && min % i == 0) {
                gcd = i;
                break;
            }
        }
        System.out.println("gcd of " + n + " and " + m + " is " + gcd);

    }

    private void printGcdOrHcfEucludian(long a, long b) {
        long gcd = 0;
        while (a > 0 && b > 0) {
            if (a > b)
                a = a % b;
            else
                b = b % a;
        }
        if (a == 0) gcd = b;
        else gcd = a;

        System.out.println("gcd " + gcd);

    }
}
