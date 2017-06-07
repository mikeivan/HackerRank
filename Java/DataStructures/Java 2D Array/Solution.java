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
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int max = -10000000;
        int sum = 0;
        
        for(int x = 1; x < 5; x++) {
            for(int y = 1; y < 5; y++) {
                
                sum = arr[x][y];
                sum += arr[x-1][y-1] + arr[x-1][y] + arr[x-1][y+1];
                sum += arr[x+1][y-1] + arr[x+1][y] + arr[x+1][y+1];
                
               
                if(sum > max){
                    max = sum;
                }
                
            }
        }
        System.out.println(max);
    }
}
