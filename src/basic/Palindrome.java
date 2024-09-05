package basic;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.println("Palindrome Example");

        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter string to check for palindrome:");
        String str = scanner.nextLine();

        boolean p = palindrome.checkForPalindrome(str, 0);
        System.out.println("The string "+ str+ "  is "+  ( p? "palindrome": " not a palindrome"));
    }

    private boolean checkForPalindrome(String str, int i) {
        if(str == null || str.isEmpty()){
            return false;
        }

        while(i <= str.length()/2){
            if( str.charAt(i) != str.charAt(str.length()-i-1)){
                return false;
            }
            i++;
        }
        return true;

    }


}
