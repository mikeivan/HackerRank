/************
 * Author: Michael "Mike" Ivan
 * HackerRank profile: 
 *    https://www.hackerrank.com/mike_ivan
 * GitHub: https://github.com/mikeivan
 ************/
 
import java.util.*;

public class Solution {
    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.    

        int i = 0;
        int[] moves = new int[game.length];
        
        //loop through loop and set all possible moves
        //0 denotes unreachable, 2 denotes reachable
        moves[0] = 2;
        
        for(i = 0; i < game.length; i++) {
            
            //1 is an invalid space to land on, skip
            if( game[i] == 1 ) { 
                continue; }
            else {
                
                //we can only process if we land on a 
                //reachable index
                
                if( moves[i] == 2 ) { 
                //mark the leap
                    if( i + leap < game.length ) {
                        if( game[i+leap] == 0 ) {
                            moves[i+leap] = 2;
                        }
                    }
                
                    //mark the single space move
                    if( i + 1 < game.length ) {
                        if( game[i+1] == 0 ) {
                            moves[i+1] = 2;
                        }
                    }
                
                    //mark the backward step
                    //move back to process that step if hasn't
                    //be visited yet
                    if( i - 1 > 0 ) {
                       if( game[i-1] == 0 && moves[i-1] == 0 ) {
                            moves[i-1] = 2;
                            i -= 2;
                        }
                    }
                
                }
            }
                  
        }

        //check if last index is reachable
        //corner case for when leap = 0 for
        //following loop
        if( moves[game.length-1] == 2 ) {
            return true;
        }
        
        //loop from the end to leap-1 to see if a valid move can
        //be made
        for(i = 0; i < leap; i++) {
            if( moves[moves.length-i-1] == 2 ) {
                return true;
            }           
        }
        
        
        return false;

    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
