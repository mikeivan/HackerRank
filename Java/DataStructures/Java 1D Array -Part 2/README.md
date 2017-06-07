## Java 1D Array (Part 2)

[Link to challenge](https://www.hackerrank.com/challenges/java-1d-array)

### What I learned
- Nothing new language wise, learned a new way of looking at a problem

### Difficulties
My initial solution was a recursive one that mapped out all possible steps in the game. This worked for
smaller boards, but would time out or run out of memory for larger boards. I know to fix this you either:
1) Trim the tree 
2) Create an equivalent loop
3) Create a new algorithm entirely.

I tried to limit the steps taken since there was a way to jump back and forth between two moves. This
either didn't solve the runtime/space issue or became too complex - passing around more arguments in 
order to keep state.

Eventually, I came up with an algorithm that visits each space sequentially. At each space if it can be
reached by a previous move, we can mark off the leap move and step back move. If the step back move marks
off a space that wasn't touched we move back to it and continue on. Once we've gone through each move, we
go back leap number of moves to see if any of those moves are visitable. If so, we can win the game.

This new approach doesn't seek to find a winning solution out of all possible solutions, instead it marks
which moves can be made and then checks if a winning state could have been reached.
