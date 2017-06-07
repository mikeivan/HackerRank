/************
 * Author: Michael "Mike" Ivan
 * HackerRank profile: 
 *    https://www.hackerrank.com/mike_ivan
 * GitHub: https://github.com/mikeivan
 ************/
 
import java.util.*;
class Solution{
   
   public static void main(String []argh)
   {
      Scanner sc = new Scanner(System.in);
      int i = 0;
       char c;
      
       
      while (sc.hasNext()) {
         String input=sc.next();
         
          Stack stack = new Stack();
          
          for(i = 0; i < input.length(); i++) {
              c = input.charAt(i);
              
              if( c == '(' || c == '{' || c == '[' ) {
                  stack.push(new Character(c));
                  
              }
              else if( c == ')' ) {
                  if( stack.empty() ) {
                      stack.push("f");
                      break;
                  }
                  
                  if( (Character)stack.peek() == '(' ) {
                      stack.pop();
                  }
                  
              }
              else if( c == '}' ) {
                  if( stack.empty() ) {
                      stack.push("f");
                      break;
                  }
                  
                  if( (Character)stack.peek() == '{' ) {
                      stack.pop();
                  }
              }
              else if( c == ']' ) {
                  if( stack.empty() ) {
                      stack.push("f");
                      break;
                  }
                  
                  if( (Character)stack.peek() == '[' ) {
                      stack.pop();
                  } 
              }
              
              
              
          }
          
          if( stack.empty() ) {
              System.out.println("true");
          }
          else {
              System.out.println("false");
          }
          
      }
      
   }
}
