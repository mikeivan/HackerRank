## Java Visitor Pattern

[Link to challenge](https://www.hackerrank.com/challenges/java-vistor-pattern)

### What I learned
- Nothing new.

### Method
First constructing the tree from the input needs to be done. Then implementing the
visitor classes is straight-forward. I went through a couple iterations of different approaches.
I settled on a set of sets in order to read in the links, filter out duplicates, and rearrange
the links if necessary.

Next I have to figure out which nodes are leafs or nodes. I do this with an array of ints that I 
use to keep the number of links going through a node. A leaf will only have one. A node will have 2
or more.

I construct the tree starting with the root node, 1. I keep track of nodes I've inserted into the
tree. I then continually loop through my set of links looking for sets that contain nodes I've already
inserted. From there I can insert this new link and continue on.

The code for inserting the root node and the rest of the nodes might be able to be combined to reduce
line count.

### Difficulties
Constructing the tree was about 90% of the challenge. The defining of the tree felt awkward.
Initially I assumed that the links given meant the parent on the left and the child on the right.
This was not correct. Also links might have duplicates.

### Thoughts/Notes
The visitor pattern part of the problem was simple. Either rename the challenge to Java Trees or
provide more code for assembling the tree.

Also, nodes are counted from 1-n, which means array access needs either index-1 or a size of n+1.
