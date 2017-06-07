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
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        
        s = s.trim();
        
        if(s.length() > 0 && s.length() < 400000) {
            String delims = "[ .,?!'_@]+";
            String[] tokens = s.split(delims);
        
            System.out.println(tokens.length);
            for(int i = 0; i < tokens.length; i++) {
                System.out.println(tokens[i]);
            }
        }
        else if( s.length() == 0 ) {
            System.out.println("0");
        }
        
        scan.close();
    }
}
