/************
 * Author: Michael "Mike" Ivan
 * HackerRank profile: 
 *    https://www.hackerrank.com/mike_ivan
 * GitHub: https://github.com/mikeivan
 ************/
 
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        String ans = "Yes";
        
        for(int i = 0; i < A.length()/2 + 1; i++) {
            if( A.charAt(i) != A.charAt(A.length()-i-1)) {
                ans = "No";
                break;
            }
        }
        System.out.println(ans);
    }
}
