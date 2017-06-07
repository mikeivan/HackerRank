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
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        //declare array based on passed in arg
        int[] a = new int[n];

        //populate array
        for(int i = 0; i < n; i++)
        {
          a[i] = scan.nextInt();
        }

        //# of negative sums
        int count = 0;
        int sum = 0;
        
        //loop through all possible sub array lengths
        for(int len = 1; len <= n; len++)
        {
            //loop through all starting positions of sub arrays
            //stop when start + len is longer than available indexes
            for(int k = 0; k+len < n+1; k++)
            {
                sum = 0;
                for(int m = 0; m < len; m++)
                {
                    sum += a[k+m];
                }
                
                if(sum < 0)
                {
                    count++;    
                }
            }
            
        }
        
        System.out.println(count);
        
    }
} 
