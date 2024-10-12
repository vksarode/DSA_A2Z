package basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoveMinElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(
            24, 29, 70, 43, 12, 27, 29, 24, 41, 12, 41, 43, 24, 70, 24, 100, 41, 43, 43, 100, 
            29, 70, 100, 43, 41, 27, 70, 70, 59, 41, 24, 24, 29, 43, 24, 27, 70, 24, 27, 70, 
            24, 70, 27, 24, 43, 27, 100, 41, 12, 70, 43, 70, 62, 12, 59, 29, 62, 41, 100, 43, 
            43, 59, 59, 70, 12, 27, 43, 43, 27, 27, 27, 24, 43, 43, 62, 43, 70, 29
        );

        equalizeArray(numbers);
        System.out.println("List of numbers: " + numbers);
    }

    public static int equalizeArray(List<Integer> arr) {

        // Write your code here

        Map<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for(Integer i: arr){

            if(map.get(i) == null){
                map.put(i, 1);
            }else{
                map.put(i, map.get(i) + 1);
            }

            if( map.get(max) == null || map.get(i) >  map.get(max)){
                max = i;
            }
        }
        final int m = max;
        int sum = map.entrySet().stream().filter(k -> k.getKey() != m).map(x-> x.getValue()).mapToInt(Integer::intValue).sum();

        return sum;
    }
}
