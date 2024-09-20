package sorting;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Leaders {

    public static void main(String[] args) {
        Leaders leaders = new Leaders();

//        String input = "30,10,10,5";
        String input  = "16,17,4,3,5,2";
        // Convert the input string to an int array
        int[] nums = Arrays.stream(input.split(",")).mapToInt(Integer::parseInt).toArray();
        leaders.leaders(nums.length, nums);
    }

    // Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int n, int arr[]) {

        ArrayList<Integer> leaderList = new ArrayList<Integer>();
        
        leaderList.add(arr[n-1]);
        int max = arr[n-1];
        for(int i=n-2; i>=0; i-- ){
            if(arr[i] >= max){
                max = Math.max(max, arr[i]);
                leaderList.add(arr[i]);
            }
        }

        Collections.reverse(leaderList);
        leaderList.stream().forEach( x-> System.out.println(x));
        return leaderList;
        // Your code here
    }
}