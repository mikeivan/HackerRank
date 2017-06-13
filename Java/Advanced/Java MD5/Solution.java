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
        
        //Need try-catch for MessageDigest.getInstance()
        try {
            MessageDigest m = MessageDigest.getInstance("MD5");
            byte[] out = m.digest(str.getBytes());
            
            //Need this to convert from byte array to string, eventually
            BigInteger temp = new BigInteger(1, out);
            
            System.out.println(temp.toString(16));
        } catch (Exception e) {
            System.out.println("something messed up");
        }
    }
}
