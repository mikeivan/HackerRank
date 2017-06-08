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
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        String command;
        int op1 = 0;
        int op2 = 0;
        
        scan.nextLine();
        
        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);
        
        for(int i = 0; i < m; i++) {
            command = scan.next();
            op1 = scan.nextInt();
            op2 = scan.nextInt();
            
            if( i+1 < m ) {
                scan.nextLine();
            }
            
            if( command.equals("AND") ) {
                if( op1 == 1 ) {
                    b1.and(b2);
                }
                else {
                    b2.and(b1);
                }
            }
            else if( command.equals("OR") ) {
                if( op1 == 1 ) {
                    b1.or(b2);
                }
                else {
                    b2.or(b1);
                }
            }
            else if( command.equals("XOR") ) {
                if( op1 == 1 ) {
                    b1.xor(b2);
                }
                else {
                    b2.xor(b1);
                }
                
            }
            else if( command.equals("FLIP") ) {
                if( op1 == 1 ) {
                    b1.flip(op2);
                }
                else {
                    b2.flip(op2);
                }
                
            }
            else if( command.equals("SET") ) {
                if( op1 == 1 ) {
                    b1.set(op2);
                }
                else {
                    b2.set(op2);
                }
                
            }
            System.out.println(b1.cardinality() + " " + b2.cardinality());
            
        }
        
        
    }
}
