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
      BigInteger n = in.nextBigInteger();
      in.close();
       
       if( n.compareTo(BigInteger.ONE) != 1)
       { System.out.print("not prime");}
       else if( n.isProbablePrime(80))
       { System.out.print("prime");}
       else
       { System.out.print("not prime");}
   }
}
