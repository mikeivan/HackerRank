/************
 * Author: Michael "Mike" Ivan
 * HackerRank profile: 
 *    https://www.hackerrank.com/mike_ivan
 * GitHub: https://github.com/mikeivan
 ************/
 
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int len=sc.nextInt();
        
        String min = str.substring(0,len);
        String max = str.substring(0,len);
        
        for(int i = 1; i < str.length()-len+1; i++) {
            String temp = str.substring(i, i+len);
            
            if(temp.compareTo(min) < 0) {
                min = temp;
            }
            
            if(temp.compareTo(max) > 0) {
                max = temp;
            }
        }
        
        System.out.println(min);
        System.out.println(max);
    }
}
