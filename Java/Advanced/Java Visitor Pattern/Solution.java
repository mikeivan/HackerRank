/************
 * Author: Michael "Mike" Ivan
 * Date: 6/6/17
 * HackerRank profile: 
 *    https://www.hackerrank.com/mike_ivan
 * GitHub: https://github.com/mikeivan
 ************/
 
import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.util.ArrayList;
import java.util.Scanner;

enum Color {
    RED, GREEN
}

abstract class Tree {

    private int value;
    private Color color;
    private int depth;

    public Tree(int value, Color color, int depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }

    public int getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }

    public int getDepth() {
        return depth;
    }

    public abstract void accept(TreeVis visitor);
}

class TreeNode extends Tree {

    private ArrayList<Tree> children = new ArrayList<>();

    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitNode(this);

        for (Tree child : children) {
            child.accept(visitor);
        }
    }

    public void addChild(Tree child) {
        children.add(child);
    }
}

class TreeLeaf extends Tree {

    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }
}

abstract class TreeVis
{
    public abstract int getResult();
    public abstract void visitNode(TreeNode node);
    public abstract void visitLeaf(TreeLeaf leaf);

}

class SumInLeavesVisitor extends TreeVis {
    
    int count = 0;
    public int getResult() {
      	
        return count;
    }

    public void visitNode(TreeNode node) {
        //only care about leaf nodes
      	//System.out.println("v: " + node.getValue() + " c: " + node.getColor() + " d:" + node.getDepth());
    }

    public void visitLeaf(TreeLeaf leaf) {
      	//System.out.println("v: " + leaf.getValue() + " c: " + leaf.getColor() + " d:" + leaf.getDepth());
        count += leaf.getValue();
    }
}

class ProductOfRedNodesVisitor extends TreeVis {
    
    long count = 1;
    long mod = 1000000007;
    public int getResult() {

        return (int)count;
    }

    public void visitNode(TreeNode node) {
      	if( node.getColor() == Color.RED ) {
            count = (count * node.getValue()) % mod;
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        if( leaf.getColor() == Color.RED ) {
            count = (count * leaf.getValue()) % mod;
        }
    }
}

class FancyVisitor extends TreeVis {
    
    int nonleaf = 0;
    int greenleaf = 0;
    public int getResult() {

        return Math.abs(nonleaf - greenleaf);
    }

    public void visitNode(TreeNode node) {
    	if( node.getDepth() % 2 == 0 ) {
            nonleaf += node.getValue();
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
    	if( leaf.getColor() == Color.GREEN ) {
            greenleaf += leaf.getValue();
        }
    }
}

public class Solution {
  
    public static Tree solve() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        int values[] = new int[n];
        Color colors[] = new Color[n];
        HashSet<HashSet<Integer>> set = new HashSet<HashSet<Integer>>();
        HashSet<Integer> inner_set;
        Iterator<HashSet<Integer>> iter;
        int isLeaf[] = new int[n+1];
        int i;
        
        //read in node values
        for(i = 0; i < n; i++) {
            values[i] = in.nextInt();
        }
        
        //read in node colors
        for(i = 0; i < n; i++) {
            if( in.nextInt() == 0 ) {
                colors[i] = Color.RED;
            }
            else {
                colors[i] = Color.GREEN;
            }
        }
        
        //create a set of sets of node links
        //read in node links
        for(i = 0; i < n-1; i++) {
            inner_set = new HashSet<Integer>();
            inner_set.add(in.nextInt());
            inner_set.add(in.nextInt());
            set.add(inner_set);
        }
        
        //find how many links through each node
        //assume links have two distinct values
        Integer[] i_arr;
        iter = set.iterator();
        while(iter.hasNext()) {
            i_arr = iter.next().toArray(new Integer[2]);
            isLeaf[i_arr[0]]++;
            isLeaf[i_arr[1]]++;
        }

        //list of nodes that have been created        
        HashMap<Integer,Tree> node_list = new HashMap<Integer,Tree>(n);
        
        TreeNode root = new TreeNode(values[0], colors[0], 0);
        node_list.put(1,root);
        
        TreeLeaf tempLeaf;
        TreeNode tempNode;
        
        //connect root children first
        iter = set.iterator();
        while(iter.hasNext()) {
            inner_set = iter.next();
            if( inner_set.contains(1) ) {
                //inner_set.remove(1);
                i_arr = inner_set.toArray(new Integer[2]);
                
                if( i_arr[0] == 1 ) {
                    i = i_arr[1];
                }
                else {
                    i = i_arr[0];
                }
                
                if( isLeaf[i] > 1 ) {
                    tempNode = new TreeNode(values[i-1], colors[i-1], 1);
                    root.addChild(tempNode);
                    node_list.put(i, tempNode);
                }
                else {
                    tempLeaf = new TreeLeaf(values[i-1], colors[i-1], 1);
                    root.addChild(tempLeaf);
                    node_list.put(i, tempLeaf);
                }
                
                iter.remove();
            }
        }
       
 
        while(set.size() > 0) {
            iter = set.iterator();
            while(iter.hasNext()) {
                inner_set = iter.next();
                i_arr = inner_set.toArray(new Integer[2]);
                
                if(node_list.containsKey(i_arr[0])) {
                    
                    if(isLeaf[i_arr[1]] > 1) {
                        tempNode = new TreeNode(values[i_arr[1]-1], colors[i_arr[1]-1],
                                                ((TreeNode)node_list.get(i_arr[0])).getDepth()+1);
                        ((TreeNode)node_list.get(i_arr[0])).addChild(tempNode);
                        node_list.put(i_arr[1], tempNode);                        
                    }
                    else {
                        tempLeaf = new TreeLeaf(values[i_arr[1]-1], colors[i_arr[1]-1],
                                                ((TreeNode)node_list.get(i_arr[0])).getDepth()+1);
                        ((TreeNode)node_list.get(i_arr[0])).addChild(tempLeaf);
                        node_list.put(i_arr[1], tempLeaf);
                    }
                    
                    iter.remove();
                }
                else if(node_list.containsKey(i_arr[1])) {
                    
                    if(isLeaf[i_arr[0]] > 1) {
                        tempNode = new TreeNode(values[i_arr[0]-1], colors[i_arr[0]-1],
                                                ((TreeNode)node_list.get(i_arr[1])).getDepth()+1);
                        ((TreeNode)node_list.get(i_arr[1])).addChild(tempNode);
                        node_list.put(i_arr[0], tempNode);                        
                    }
                    else {
                        tempLeaf = new TreeLeaf(values[i_arr[0]-1], colors[i_arr[0]-1],
                                                ((TreeNode)node_list.get(i_arr[1])).getDepth()+1);
                        ((TreeNode)node_list.get(i_arr[1])).addChild(tempLeaf);
                        node_list.put(i_arr[0], tempLeaf);
                    }                    
                    
                    iter.remove();
                }
                
            }
        }
 
        return root;
    }
    
    
    public static void main(String[] args) {
      	Tree root = solve();
		SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
      	ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
      	FancyVisitor vis3 = new FancyVisitor();

      	root.accept(vis1);
      	root.accept(vis2);
      	root.accept(vis3);

      	int res1 = vis1.getResult();
      	int res2 = vis2.getResult();
      	int res3 = vis3.getResult();

      	System.out.println(res1);
     	System.out.println(res2);
    	System.out.println(res3);
	}
}
