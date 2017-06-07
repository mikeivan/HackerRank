/************
 * Author: Michael "Mike" Ivan
 * HackerRank profile: 
 *    https://www.hackerrank.com/mike_ivan
 * GitHub: https://github.com/mikeivan
 ************/
 
import java.math.BigDecimal;
import java.util.*;
class Solution{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();
        
        BigDecimal curr;
        BigDecimal next;
        String temp = "";

        //Use a bubblesort to sort the list
        for(int j = 0; j <= n; j++)
        {
            for(int k = 0; k < n-1; k++)
            {
                curr = new BigDecimal(s[k]);
                next = new BigDecimal(s[k+1]);
                
                if(curr.compareTo(next) == -1)
                {
                    temp = s[k];
                    s[k] = s[k+1];
                    s[k+1] = temp;
                }
                
            }    
        }
        
        
        
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}
