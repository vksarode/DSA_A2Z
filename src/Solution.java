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


public class Solution {
    public static void main(String[] args) throws IOException {

//                int result = palindromeIndex("kjowoemiduaaxasnqghxbxkiccikxbxhgqnsaxaaudimeowojk");

        List<String> strings = Arrays.asList(
                "quyjjdcgsvvsgcdjjyq",
                "hgygsvlfwcwnswtuhmyaljkqlqjjqlqkjlaymhutwsnwcflvsgygh",
                "fgnfnidynhxebxxxfmxixhsruldhsaobhlcggchboashdlurshxixmfxxxbexhnydinfngf",
                "bsyhvwfuesumsehmytqioswvpcbxyolapfywdxeacyuruybhbwxjmrrmjxwbhbyuruycaexdwyfpaloyxbcpwsoiqtymhesmuseufwvhysb",
                "fvyqxqxynewuebtcuqdwyetyqqisappmunmnldmkttkmdlnmnumppasiqyteywdquctbeuwenyxqxqyvf",
                "mmbiefhflbeckaecprwfgmqlydfroxrblulpasumubqhhbvlqpixvvxipqlvbhqbumusaplulbrxorfdylqmgfwrpceakceblfhfeibmm",
                "tpqknkmbgasitnwqrqasvolmevkasccsakvemlosaqrqwntisagbmknkqpt",
                "lhrxvssvxrhl",
                "prcoitfiptvcxrvoalqmfpnqyhrubxspplrftomfehbbhefmotfrlppsxburhyqnpfmqlaorxcvtpiftiocrp",
                "kjowoemiduaaxasnqghxbxkiccikxbxhgqnsaxaaudimeowojk"
        );

        for(String s : strings) {
            System.out.println(palindromeIndex(s));
        }
    }

    public static int palindromeIndex(String s) {
        // Write your code here

        char[] ch = new char[s.length()];
        ch = s.toCharArray();
        int result = 0;
        for(int i=0, j=ch.length -1; i < j; i++){
            if(ch[i] != ch[j]){
                result  = -1;
                break;
            }
        }
        int ind  = -1;
        if(result ==0){
            return -1;
        }else{
            for(int i=0, j=ch.length -1; i < j; i++, j--){
                if(ch[i] != ch[j]){
                    if((i+1) < ch.length && ch[i+1] == ch[j]){
                        ind = i;
                        j++;
                    }else if((j-1) >=0 && ch[i] == ch[j-1]){
                        ind = j;
                        i--;
                    }
                }
            }
        }
        return  ind;
    }
}
