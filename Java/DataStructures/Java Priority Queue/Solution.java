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

class Student{
   private int token;
   private String fname;
   private double cgpa;
   public Student(int id, String fname, double cgpa) {
      super();
      this.token = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getToken() {
      return token;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
}

class Checker implements Comparator<Student>{
    public int compare(Student a, Student b) {
        
        if( a.getCgpa() > b.getCgpa() ) {
            return -1;
        }
        else if( a.getCgpa() < b.getCgpa() ) {
            return 1;
        }
        else {
            if( a.getFname().equals(b.getFname()) ) {
                if( a.getToken() < b.getToken() ) {
                    return -1;
                }
                else {
                    return 1;
                }
            }
            else {
                return a.getFname().compareTo(b.getFname());
            }
        }
            
    }
    
}

public class Solution {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      Checker checker = new Checker();
      PriorityQueue<Student> pq = new PriorityQueue<Student>(4, checker);
        String name;
        int id;
        double gpa;
      int totalEvents = Integer.parseInt(in.nextLine());
      while(totalEvents>0){
         String event = in.next();
            
           if( event.equals("ENTER") ) {
               name = in.next();
               gpa = in.nextDouble();
               id = in.nextInt();
               if(totalEvents>2) {
                in.nextLine();
               }
                   
               pq.add(new Student(id, name, gpa));
           }
           else if( event.equals("SERVED") ) {
               pq.poll();
           }
           
         totalEvents--;
      }
        
        if( pq.size() == 0 ) { 
            System.out.println("EMPTY");
        }
        else {
        
          Iterator<Student> it = pq.iterator();
          while( it.hasNext() ) {
              System.out.println( ((Student)it.next()).getFname() );
              it.remove();
          }
        }
        
    }
}
