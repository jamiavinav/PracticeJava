package avinav.practice;

public class TrinaryTreeNode {

    private TrinaryTreeNode leftChild;
    private TrinaryTreeNode rightChild;
    private TrinaryTreeNode centerChild;
    private int data;
    public TrinaryTreeNode getLeftChild() {
        return leftChild;
    }
    public void setLeftChild(TrinaryTreeNode leftChild) {
        this.leftChild = leftChild;
    }
    public TrinaryTreeNode getRightChild() {
        return rightChild;
    }
    public void setRightChild(TrinaryTreeNode rightChild) {
        this.rightChild = rightChild;
    }
    public TrinaryTreeNode getCenterChild() {
        return centerChild;
    }
    public void setCenterChild(TrinaryTreeNode centerChild) {
        this.centerChild = centerChild;
    }
    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }
}
