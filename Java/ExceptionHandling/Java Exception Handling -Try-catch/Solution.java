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
        try {
            int n = in.nextInt();
            int d = in.nextInt();
            
            System.out.println(n/d);
        }
        catch(InputMismatchException e) {
            System.out.println(e.getClass().getName());
        }catch (ArithmeticException e) {
            System.out.println(e.toString());
        }
    }
}
