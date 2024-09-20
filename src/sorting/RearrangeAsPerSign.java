package sorting;

import java.util.Arrays;

public class RearrangeAsPerSign {
    public static void main(String[] args) {

        RearrangeAsPerSign obj = new RearrangeAsPerSign();
        String input = "3,1,-2,-5,2,-4";

        // Convert the input string to an int array
        int[] nums = Arrays.stream(input.split(",")).mapToInt(Integer::parseInt).toArray();

//        nums = obj.rearrangeArray_Bruteforce(nums);
//        System.out.println("After - rearrangeArray_Bruteforce");
        Arrays.stream(nums).forEach(System.out::println);

        nums = obj.rearrangeArray_Optimal(nums);
        System.out.println("After - rearrangeArray_Optimal");
        Arrays.stream(nums).forEach(System.out::println);
    }

    public int[] rearrangeArray_Bruteforce(int[] nums) {

        int pos[] = new int [nums.length/2];
        int neg[] = new int [nums.length/2];
        int resArr[] = new int [nums.length];

        for(int i=0, j=0, k=0; i<nums.length; i++ ){
            if(nums[i] >= 0){
                pos[j++] = nums[i];
            }else{
                neg[k++] = nums[i];
            }
        }
        for(int i=0;i<nums.length/2;i++){
            resArr[2*i ] = pos[i];
            resArr[2*i + 1] = neg[i];
        }
        return resArr;
    }

    public int[] rearrangeArray_Optimal(int[] nums) {
        int resArr[] = new int [nums.length];
        for(int i=0, j=0, k=0; i<nums.length; i++ ){
            if(nums[i] >= 0){
                resArr[2*j ] = nums[i];
                j++;
            }else{
                resArr[2*k + 1] = nums[i];
                k++;
            }
        }
        return resArr;
    }
}
