/************
 * Author: Michael "Mike" Ivan
 * Date: 6/13/17
 * HackerRank profile: 
 *    https://www.hackerrank.com/mike_ivan
 * GitHub: https://github.com/mikeivan
 ************/
 
import java.io.*;
import java.util.*;
interface PerformOperation {
 boolean check(int a);
}
class MyMath {
 public static boolean checker(PerformOperation p, int num) {
  return p.check(num);
 }
 
    PerformOperation is_odd() {
       return (n) -> { return (n%2)==1; };
   }

   PerformOperation is_prime() {
       return (n) -> {
           boolean ret = true;
           
           if( n < 1 ) { return false; }
           
           for(int i = 2; i < n; i++) {
               if( n%i==0 ) {
                   ret = false;
                   break;
               }
           }
           
           
           return ret;
       };
   }

   PerformOperation is_palindrome() {
       return (n) -> {
           int temp = n;
           int sum = 0;
           int rem = 0;
           
           while(n>0) {
               rem = n%10;
               sum = (sum*10) + rem;
               n /= 10;               
           }
           
           if( temp == sum ) {
               return true;
           }
           else {
               return false;
           }
           
           
       };
   }
}

public class Solution {

 public static void main(String[] args) throws IOException {
  MyMath ob = new MyMath();
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  int T = Integer.parseInt(br.readLine());
  PerformOperation op;
  boolean ret = false;
  String ans = null;
  while (T--> 0) {
   String s = br.readLine().trim();
   StringTokenizer st = new StringTokenizer(s);
   int ch = Integer.parseInt(st.nextToken());
   int num = Integer.parseInt(st.nextToken());
   if (ch == 1) {
    op = ob.is_odd();
    ret = ob.checker(op, num);
    ans = (ret) ? "ODD" : "EVEN";
   } else if (ch == 2) {
    op = ob.is_prime();
    ret = ob.checker(op, num);
    ans = (ret) ? "PRIME" : "COMPOSITE";
   } else if (ch == 3) {
    op = ob.is_palindrome();
    ret = ob.checker(op, num);
    ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

   }
   System.out.println(ans);
  }
 }
}
