package avinav.practice;

public class BinaryTree {

    private TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public static void main(String[] args) {
        
    }

    // checkIf tree is balanced
    public boolean isBalanced(BinaryTree tree) {
        // for a tree to be balanced, the maxDepth - minDepth cannot be greater than 1 
        if (Math.abs(tree.maxDepth() - tree.minDepth()) > 1 ) {
            return false;
        } else {
            return true;
        }
    }

    public int maxDepth() {
        return maxDepth(getRoot());
    }

    public int maxDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        
        int leftDepth = maxDepth(node.getLeft());
        int rightDepth = maxDepth(node.getRight());
        
        int maxDepth = (leftDepth > rightDepth) ? leftDepth : rightDepth;
        return maxDepth + 1;
    }
    
    public int minDepth() {
        return minDepth(getRoot());
    }

    public int minDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        
        int leftDepth = minDepth(node.getLeft());
        int rightDepth = minDepth(node.getRight());
        
        int minDepth = (leftDepth > rightDepth) ? rightDepth : leftDepth;
        return minDepth + 1;
    }
    
    /*
     * https://leetcode.com/problems/merge-two-binary-trees/description/
     * Given two binary trees and imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped while the others are not.

You need to merge them into a new binary tree. The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node. Otherwise, the NOT null node will be used as the node of new tree.

Example 1:
Input: 
    Tree 1                     Tree 2                  
          1                         2                             
         / \                       / \                            
        3   2                     1   3                        
       /                           \   \                      
      5                             4   7                  
Output: 
Merged tree:
         3
        / \
       4   5
      / \   \ 
     5   4   7
Note: The merging process must start from the root nodes of both trees.
     */
   // public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        // start from the root node, and add corresponding nodes, 
        // Traverse to bottom nodes, until done for all. 
        // I am doing Pre-order traversal. so, add current node first, then go left, then go right
        
        // Create merged node 
        // then pass all three nodes, t1, t2 and result to a inner function.
   // }
    
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode result = null;
        if ((t1 == null) && (t2 == null) ) {
            return result;
        }
        
        
        if (t1 == null) {
            result = new TreeNode(t2.val);
        } else if (t2 == null ) {
            result= new TreeNode(t1.val);
        } else {
            result = new TreeNode(t1.val + t2.val);
        }
        System.out.print(" " + result.val);
        
        // Go left 
        TreeNode t1Left = null;
        TreeNode t2Left = null;
        if ((t1 != null) && (t1.left!=null)) {
            t1Left = t1.left;
        }
        
        if ((t2 != null) && (t2.left!=null)) {
            t2Left = t2.left;
        }
        result.left = mergeTrees(t1Left, t2Left);

        
        // Go right
        TreeNode t1Right = null;
        TreeNode t2Right = null;
        if ((t1 != null) && (t1.right!=null)) {
            t1Right = t1.right;
        }
        
        if ((t2 != null) && (t2.right!=null)) {
            t2Right = t2.right;
        }
        result.right = mergeTrees(t1Right, t2Right);
        
        return result;
    }
    
    /*
     * Given two binary trees, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical and the nodes have the same value.


Example 1:

Input:     1         1
          / \       / \
         2   3     2   3

        [1,2,3],   [1,2,3]

Output: true
Example 2:

Input:     1         1
          /           \
         2             2

        [1,2],     [1,null,2]

Output: false
Example 3:

Input:     1         1
          / \       / \
         2   1     1   2

        [1,2,1],   [1,1,2]

Output: false
     */
    public boolean isSameTree (TreeNode p, TreeNode q) {
        if ((p == null) && (q == null) ) {
            return true;
        }
        
        boolean isSameNode = false;
        boolean isSameStruture = false;
        boolean hasSameValue = false;
        if (p == null) {
            // one is null other is not, structure is different
            return false;
        } else if (q == null ) {
            // one is null other is not, structure is different
            return false;
        } else {
            //both nodes have values, so same structure
            isSameStruture = true;
            // now check values
            if (p.val == q.val) {
                hasSameValue = true;
            } else {
                hasSameValue = false;
            }
        }

        // check if the node have sameValue and sameStructure
        if(!(isSameStruture && hasSameValue)) {
            isSameNode = false;
            return isSameNode;
        } else {
            // isSameNode is true so far, continue through your left and right search
            isSameNode = true;
        }
        
        System.out.print(" " + isSameNode);
        
        // Go left 
        TreeNode pLeft = null;
        TreeNode qLeft = null;
        boolean isLeftSame = false;
        if ((p != null) && (p.left!=null)) {
            pLeft = p.left;
        }
        
        if ((q != null) && (q.left!=null)) {
            qLeft = q.left;
        }
        isLeftSame = isSameTree(pLeft, qLeft);
        if (!(isSameNode && isLeftSame)) {
            isSameNode = false;
            return isSameNode;
        } else {
            // isSameNode for left as well, continue through your right subtree check
            isSameNode = true;
        }
        
        // Go right
        TreeNode pRight = null;
        TreeNode qRight = null;
        boolean isSameRight = false;
        if ((p != null) && (p.right!=null)) {
            pRight = p.right;
        }
        
        if ((q != null) && (q.right!=null)) {
            qRight = q.right;
        }
        isSameRight = isSameTree(pRight, qRight);
        
        if (!(isSameNode && isSameRight)) {
            isSameNode = false;
            return isSameNode;
        } else {
            // isSameNode for right as well
            isSameNode = true;
        }
        return isSameNode;
    }
}
