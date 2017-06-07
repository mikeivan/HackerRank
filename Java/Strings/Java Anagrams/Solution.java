/************
 * Author: Michael "Mike" Ivan
 * Date:
 * HackerRank profile: 
 *    https://www.hackerrank.com/mike_ivan
 * GitHub: https://github.com/mikeivan
 ************/
 
import java.io.*;
import java.util.*;

public class Solution {

    static boolean isAnagram(String a, String b) {
        
        if(a.length() != b.length()) { return false; }
        
        // Convert strings to lower case
        String a1 = a.toLowerCase();
        String b1 = b.toLowerCase();
        
        char[] ac = a1.toCharArray();
        char[] bc = b1.toCharArray();
        
        Arrays.sort(ac);
        Arrays.sort(bc);
        
        for(int i = 0; i < a1.length(); i++) {
            if( ac[i] != bc[i] ) {
                return false;
            }
        }
        
        return true;
        
    }


    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
