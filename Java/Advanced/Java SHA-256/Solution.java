/************
 * Author: Michael "Mike" Ivan
 * Date: 6/13/17
 * HackerRank profile: 
 *    https://www.hackerrank.com/mike_ivan
 * GitHub: https://github.com/mikeivan
 ************/

import java.io.*;
import java.util.*;
import java.security.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String str = in.next();
        String out_str;
        
        //Need try-catch for MessageDigest.getInstance()
        try {
            MessageDigest m = MessageDigest.getInstance("SHA-256");
            byte[] out = m.digest(str.getBytes());
            
            //Need this to convert from byte array to string, eventually
            BigInteger temp = new BigInteger(1, out);
            
            out_str = temp.toString(16);
            
            //add leading zeroes if needed
            while(out_str.length() < 64) {
                out_str = "0" + out_str;
            }
            
            System.out.printf(out_str);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
