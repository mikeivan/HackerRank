/************
 * Author: Michael "Mike" Ivan
 * Date:
 * HackerRank profile: 
 *    https://www.hackerrank.com/mike_ivan
 * GitHub: https://github.com/mikeivan
 ************/
 
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            String ans = "";
            int current = a;
            for(int j = 0; j < n; j++) {
                current += Math.pow(2, j) * b;
                if( j > 0){
                    ans += " " + current;
                }
                else{
                    ans += current;
                }
                
            }
            System.out.println(ans);
        }
        in.close();
    }
}
