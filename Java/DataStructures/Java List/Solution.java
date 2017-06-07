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
        
        int i = 0;
        String s;
        
        //read in data
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        //load list with input
        ArrayList<Integer> l = new ArrayList<Integer>(n);
        
        for(i = 0; i < n; i++) {
            l.add(scan.nextInt());   
        }
        
        //sanity check
        //System.out.println(l);
        
        //get # of queries and loop through them
        int q = scan.nextInt();
        for(i = 0; i < q; i++) {
            s = scan.next();
            
            if(s.equals("Insert")) {
                l.add(scan.nextInt(), scan.nextInt());
            }
            else if(s.equals("Delete")) {
                l.remove(scan.nextInt());
            }
            
            
        }
        
        //print out list
        for(i = 0; i < l.size(); i++) {
            if(i > 0 ) {
                System.out.print(" ");
            }
            System.out.print(l.get(i));
        }
        
    }
}
