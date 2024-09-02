import patterns.Pattern;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class AllFactorsOfANumber {
    public static void main(String[] args) {
        System.out.println("AllFactorsOfANumber.");

        Pattern p = new Pattern();
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter N:");
        long n = scanner.nextLong();
        TreeSet<Long> set = new TreeSet<>();
//        for (long i = 1; i < Math.sqrt(n); i++) {
        for (long i = 1; i*i <= n; i++) {
            if (n % i == 0) {
                set.add(i);
                if (n / i != i) {
                    set.add(n / i);
                }
            }

        }

        System.out.println("divisor's of "+ n +" are:" + set);
    }
}
