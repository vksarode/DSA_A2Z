import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Jumping {
    public static void main(String[] args) throws IOException {
       /* BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> c = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = jumpingOnClouds(c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();*/

        List<Integer> c = new ArrayList<>();
        c.add(0);
        c.add(0);
        c.add(0);
        c.add(0);
        c.add(1);
        c.add(0);

        int result = jumpingOnClouds(c);
        System.out.println("jumpings  "+  result);

    }

    public static int jumpingOnClouds(List<Integer> c) {
        // Write your code here
        int n = c.size();
        int cnt = 0;
        int i = 0;
        while(i < n){
            if(i+2 <n && c.get(i+2) == 0){
                i=i+2;
                cnt = cnt + 1;
            }else if(i+1 <n && c.get(i+1) == 0){
                i = i +1;
                cnt = cnt + 1;
            }else{
                i++;
            }
        }

        return cnt;
    }

    public static int commonChild(String s1, String s2) {

        int result = 0;
        List<Character> s1List = new ArrayList<>();
        List<Character> s2List = new ArrayList<>();

        for(int i =0; i<s1.length(); i++){
            s1List.add(s1.charAt(i));
        }
        for(int i =0; i<s2.length(); i++){
            s2List.add(s2.charAt(i));
        }

        for(Character c : s1List){
            if(! s2List.contains(c) ){
                s1List.remove(c);
            }
        }


        return result;
    }
}
