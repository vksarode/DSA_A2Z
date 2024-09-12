package sorting;

import java.util.Arrays;

public class RotateArrayByKTimesToLeft {
    public static void main(String[] args) {

        int n = 7;
        int[] nums = new int[n];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;
        nums[5] = 6;
        nums[6] = 7;
//        nums[7] = 8;

        System.out.println("Before.");
        Arrays.stream(nums).forEach(System.out::println);

        int k = 3;

        int temp[] = new int[k];
        for(int i =0; i<k ; i++){
            temp[i] = nums[i];
        }

        for(int i = k, j=0; i<n ;i++){
            nums[j++] = nums[i];
        }
        for(int i =n-k, j=0; i<n; i++){
            nums[i] = temp[j++];
        }
        System.out.println("After.");
        Arrays.stream(nums).forEach(System.out::println);

    }
}
