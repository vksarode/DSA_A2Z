package sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        System.out.println("SelectionSort example.");
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};

        a= selectionSort.sort(a);
        Arrays.stream(a).forEach(System.out:: println );
    }

    private int[] sort( int a[]) {
        int min =0;int temp =0;
        for (int i =0; i < a.length-2; i ++){
            min = i;
            for (int j = i; j<a.length-1; j++){
                if(a[j] < a[min]){
                    min  = j;
                }
                temp  = a[min];
                a[min]= a[i];
                a[i] = temp;
            }
        }
        return a;
    }
}
