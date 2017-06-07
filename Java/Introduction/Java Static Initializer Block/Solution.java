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

  public static int B;
  public static int H;
  public static boolean flag = true;

  static {
    Scanner scan = new Scanner(System.in);
    B = scan.nextInt();
    scan.nextLine();
    H = scan.nextInt();
    
    if(B <= 0 || H <= 0 )
    {
        flag = false;
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
  }


public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class
