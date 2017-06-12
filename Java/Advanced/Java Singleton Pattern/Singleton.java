/************
 * Author: Michael "Mike" Ivan
 * Date: 6/5/17
 * HackerRank profile: 
 *    https://www.hackerrank.com/mike_ivan
 * GitHub: https://github.com/mikeivan
 ************/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class Singleton{
    public static String str;
    private static Singleton instance = new Singleton();
    
    private Singleton() {
        
    }
    
    public static Singleton getSingleInstance() {
        return instance;
    }
}
