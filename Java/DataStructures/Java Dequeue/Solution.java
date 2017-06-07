/************
 * Author: Michael "Mike" Ivan
 * HackerRank profile: 
 *    https://www.hackerrank.com/mike_ivan
 * GitHub: https://github.com/mikeivan
 ************/
 
    import java.util.*;
    public class test {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque deque = new ArrayDeque<>();
            HashSet hs = new HashSet();
            int max = 0;
            int out = 0;
            int n = in.nextInt();
            int m = in.nextInt();

            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
                
                deque.add(num);
                hs.add(num);
                
                if(deque.size() == m) {
                    if(hs.size() > max) {
                        max = hs.size();
                    }
                    
                    out = (int)deque.pop();
                    if( !deque.contains(out) ) {
                        hs.remove(out);
                    }
                }
                
               
            }
            System.out.println(max);
        }
    }
