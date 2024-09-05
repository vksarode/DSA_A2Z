package basic;


import java.lang.reflect.Array;
import java.util.Arrays;

public class Recursion {
    public static void main(String[] args) {
        //reverse an array;
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};
        Arrays.stream(a).forEach(i -> System.out.print(i +", "));
        System.out.println();

//        reverse(a, 0);
         reverse_2(a, 0, a.length-1);

    }

    private static void reverse_2(int[] a, int start, int end) {

        if(start >= end){
            System.out.println("reverse_2:");
            Arrays.stream(a).forEach(var -> System.out.print(var +", "));
            return;
        }

        swap(a, start, end);
        reverse_2(a, start+1, end-1);

    }

    private static void swap(int[] a, int start, int end) {
        int temp = a[start];
        a[start] = a[end];
        a[end] = temp;
    }


    public static void reverse(int[] a, int i) {

        if (i >= a.length / 2) {
            Arrays.stream(a).forEach(var -> System.out.print(var +", "));
            return;
        }
        swap(a, i);
        reverse(a, i + 1);
    }

    public static void swap(int[] a, int i) {
        int temp = a[i];
        a[i] = a[a.length - i - 1];
        a[a.length - i - 1] = temp;
    }
}
