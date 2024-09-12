package sorting;

import java.util.Arrays;

public class RotateArrayByKTimesToRight {
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

//        rotateLeft(nums);

        rotateLeft_2(nums);

    }

    private static void rotateLeft(int[] nums) {
        int k = 2;

        k = k% nums.length;
        int temp[] = new int[k];
        for(int j = 0, i = nums.length-k; i< nums.length ; i++){
            temp[j++] = nums[i];
        }

        for(int i = nums.length-1, j = nums.length-1-k; i>=0 && j>=0  ; i--, j--){
            nums[i] = nums[j];
        }
        for(int i =0; i< temp.length; i++){
            nums[i] = temp[i];
        }
        System.out.println("After.");
        Arrays.stream(nums).forEach(System.out::println);
    }

    private static void rotateLeft_2(int[] nums){

        int k = 2;

        k = k% nums.length;

        nums = reverse(nums, 0, k-1);
        nums = reverse(nums, k, nums.length-1);
        nums = reverse(nums, 0, nums.length-1);
        System.out.println("After.");
        Arrays.stream(nums).forEach(System.out::println);
    }



    private static int[] reverse(int []nums,  int start, int end){
        int temp =0;
        for(int i=start, j= end; i<= (start+end )/2; i++, j--){
            temp = nums[i];
            nums[ i] = nums[j];
            nums[j]= temp;
        }

        return nums;
    }

}
