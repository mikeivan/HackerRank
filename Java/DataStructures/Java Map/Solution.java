/************
 * Author: Michael "Mike" Ivan
 * HackerRank profile: 
 *    https://www.hackerrank.com/mike_ivan
 * GitHub: https://github.com/mikeivan
 ************/

import java.util.*;
import java.io.*;

class Solution{
   public static void main(String []argh)
   {
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      in.nextLine();
       
       HashMap<String, Integer> hm = new HashMap<String, Integer>(n);
       Integer ret;
       
       //insert into map
      for(int i=0;i<n;i++)
      {
         String name=in.nextLine();
         int phone=in.nextInt();
         in.nextLine();
          
          hm.put(name, phone);
      }
       //do queries
      while(in.hasNext())
      {
         String s=in.nextLine();
          ret = hm.get(s);
          
          if(ret == null) {
              System.out.println("Not found");
          }
          else {
              System.out.println(s + "=" + ret);
          }
          
      }
   }
}
