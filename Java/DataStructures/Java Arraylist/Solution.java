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
        
        //read in data
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int n2 = 0;
        
        ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
        
        //loop through each line in list
        for(int i = 0; i < n; i++) {
            //find number of following elements to add to 
            //arraylist
            n2 = scan.nextInt();
            
            //System.out.println("i: " + i + " n2: " +n2 );
            
            //create a new arraylist for each line
            ArrayList<Integer> temp = new ArrayList<Integer>();
            
            for(int i2 = 0; i2 < n2; i2++) {
                temp.add(scan.nextInt());
            }
            
            a.add(temp);
            
        }
        
        //run queries
        int n_queries = scan.nextInt();
        
        for(int m = 0; m < n_queries; m++) {
            
            try {
                int row = scan.nextInt();
                int col = scan.nextInt();
                
                System.out.println(a.get(row-1).get(col-1));
                
            } catch(IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
            
        }
        
    }
}
