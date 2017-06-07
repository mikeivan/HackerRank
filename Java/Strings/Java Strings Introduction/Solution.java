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
        String B=sc.next();
        
        //print sum of lengths
        System.out.println(A.length() + B.length());

        //figure out lexigraphical order
        if( A.compareTo(B) > 0 ) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        
        //capitalize first letter of each string
        char A1 = A.charAt(0);
        char B1 = B.charAt(0);
        System.out.println("" + Character.toUpperCase(A1) + A.substring(1,A.length()) + " " +
                				Character.toUpperCase(B1) + B.substring(1,B.length()));
        
    }
}
