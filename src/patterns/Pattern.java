package patterns;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        System.out.println("Pattern examples.");

        Pattern p = new Pattern();
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter N:");
        int n = scanner.nextInt();
        p.pattern1(n);
    }

    private void pattern1(int n) {
        String pattern = """
                Input Format: N = 3
                Result:
                  * 
                 ***
                *****  
                Input Format: N = 6
                Result:
                     *    
                    ***   
                   *****  
                  ******* 
                 *********
                ***********
                """;
        for (int i = 0; i < n; i++) {
            //Spaces
            for (int j = i; j < n-1; j++) {
                System.out.print(" ");
            }

            //number
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }

            //Spaces
            for (int j = i; j < n-1; j++) {
                System.out.print(" ");
            }
            System.out.println();

        }

    }
}
