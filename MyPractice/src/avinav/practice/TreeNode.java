package avinav.practice;

public class TreeNode {

    private TreeNode leftChild;
    private TreeNode rightChild;
    private TreeNode centerChild;
    private int data;
    public TreeNode getLeftChild() {
        return leftChild;
    }
    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }
    public TreeNode getRightChild() {
        return rightChild;
    }
    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }
    public TreeNode getCenterChild() {
        return centerChild;
    }
    public void setCenterChild(TreeNode centerChild) {
        this.centerChild = centerChild;
    }
    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }
}
