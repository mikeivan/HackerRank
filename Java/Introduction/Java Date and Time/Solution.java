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
        String month = in.next();
        String day = in.next();
        String year = in.next();
        String out = "";
        
       
        
        Calendar cal = Calendar.getInstance();
        cal.set(Integer.parseInt(year), Integer.parseInt(month)-1, Integer.parseInt(day));
    
        int temp = cal.get(Calendar.DAY_OF_WEEK);

        if(temp == Calendar.SUNDAY) {out = "SUNDAY";}
        else if(temp == Calendar.MONDAY) { out = "MONDAY";}
        else if(temp == Calendar.TUESDAY) { out = "TUESDAY";}
        else if(temp == Calendar.WEDNESDAY) {out = "WEDNESDAY";}
        else if(temp == Calendar.THURSDAY) {out = "THURSDAY";}
        else if(temp == Calendar.FRIDAY) {out = "FRIDAY";}
        else { out = "SATURDAY";}
     
            
        System.out.println(out);
    }
}
