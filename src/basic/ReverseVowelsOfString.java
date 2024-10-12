package basic;

public class ReverseVowelsOfString {
    public static void main(String[] args) {
//        String s = "IceCream";
        String s = "A man, a plan, a canal: Panama";

        System.out.println("Original String:" + s);
        System.out.println("Result String:" + reverseVowels(s.toCharArray()));
    }

    private static String reverseVowels(char[] a) {
        boolean leftVowel = false;
        boolean rightVowel = false;

        for (int i = 0, j = a.length-1; i < j; ) {

            if (!isVowel(a[i])) {
                    i++;
            }else{
                leftVowel = true;
            }

            if (!isVowel(a[j])) {
                j--;
            }else{
                rightVowel = true;
            }
            if(i<j && leftVowel && rightVowel){
                char ch = a[i];
                a[i] = a[j];
                a[j] = ch ;
                i++;
                j--;
                leftVowel = false;
                rightVowel = false;
            }
        }
        return String.valueOf(a);
    }

    public static boolean isVowel(char c) {
        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                return true;
            default:
                return false;
        }
    }
}
