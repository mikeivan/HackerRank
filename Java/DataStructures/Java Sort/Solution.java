/************
 * Author: Michael "Mike" Ivan
 * HackerRank profile: 
 *    https://www.hackerrank.com/mike_ivan
 * GitHub: https://github.com/mikeivan
 ************/
 
import java.util.*;

class Student{
   private int id;
   private String fname;
   private double cgpa;
   public Student(int id, String fname, double cgpa) {
      super();
      this.id = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getId() {
      return id;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
}

class Checker implements Comparator<Student> {
    public int compare(Student a, Student b) {
        if( a.getCgpa() > b.getCgpa() ) {
            return -1;
        }
        else if( b.getCgpa() > a.getCgpa() ) {
            return 1;
        }
        else {
            int ret = a.getFname().compareTo(b.getFname());
            
            if( ret == 0 ) {
                if( a.getId() > b.getId() ) {
                    return -1;
                }
                else {
                    return 1;
                }
            }
            else {
                return ret;
            }
        }
    }
}

public class Solution
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      
      List<Student> studentList = new ArrayList<Student>();
      while(testCases>0){
         int id = in.nextInt();
         String fname = in.next();
         double cgpa = in.nextDouble();
         
         Student st = new Student(id, fname, cgpa);
         studentList.add(st);
         
         testCases--;
      }
       
       Checker checker = new Checker();
       
       Collections.sort(studentList, checker);
      
         for(Student st: studentList){
         System.out.println(st.getFname());
      }
   }
}
