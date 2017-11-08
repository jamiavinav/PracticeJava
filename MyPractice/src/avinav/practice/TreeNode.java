package avinav.practice;

public class TreeNode {

    Integer val;
    TreeNode left;
    TreeNode right;

    public TreeNode() {
        
    }
    
    public TreeNode(Integer data) {
        this.val = data;
    }
    
    public Integer getData() {
        return val;
    }

    public void setData(Integer data) {
        this.val = data;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
    
}
