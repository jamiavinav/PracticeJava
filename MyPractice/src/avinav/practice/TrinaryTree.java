package avinav.practice;

public class TrinaryTree {

    private TreeNode rootNode;

    public TreeNode getRootNode() {
        return rootNode;
    }

    public void setRootNode(TreeNode rootNode) {
        this.rootNode = rootNode;
    }

    public void insert(int data) 
    { 
        TreeNode newNode = new TreeNode(); 
        newNode.setData(data); 
        // This takes care of the case when there is no root node
        if (rootNode == null) { 
            rootNode = newNode; 
        return; 
        } else {
            add(rootNode, newNode);
        }
    }
    
    private void add(TreeNode root, TreeNode newNode) {
        // Keep going left if the new node is smaller than current node
        if (newNode.getData() < root.getData()) {
            if (root.getLeftChild() == null) {
                root.setLeftChild(newNode);
            } else {
                add(root.getLeftChild(), newNode);
            }
        } else if (newNode.getData() > root.getData()) {
        // Keep going right if the new node is greater than current node
            if (root.getRightChild() == null) {
                root.setRightChild(newNode);
            } else {
                add(root.getRightChild(), newNode);
            }
        } else {
        // Otherwise go down to the lowest possible center node.
            if (root.getCenterChild() == null) {
                root.setCenterChild(newNode);
            } else {
                add(root.getCenterChild(), newNode);
            }
        }
    }

    public void deleteData(int data) {
        //The tree is empty
        if (rootNode == null) {
            return;
        }
        delete(null, rootNode, data);
    }

    private void delete(TreeNode parentNode, TreeNode currentNode, int dataToDelete) {
        if (dataToDelete < currentNode.getData()) {
            if (currentNode.getLeftChild() != null )
                // Continue searching on left
                delete(currentNode, currentNode.getLeftChild(), dataToDelete);
        } else if (dataToDelete > currentNode.getData()) {
            if (currentNode.getRightChild() != null)
                // Continue searching on right
                delete(currentNode, currentNode.getRightChild(), dataToDelete);
        } else if (dataToDelete == currentNode.getData()){
            // This is the right value to delete. But first delete the lowest(leaf) center node
            if (currentNode.getCenterChild() != null) {
                // Continue going down to the leaf node
                while(currentNode.getCenterChild() != null) {
                    parentNode = currentNode;
                    currentNode = currentNode.getCenterChild();
                }
                // The next child is null. This is the current node to delete.
                // so point it's parent's center child to null
                parentNode.setCenterChild(null);
                return;
            }
            // Otherwise, the node to delete does not have a center child.

            // Now look at it's left child. Following a binary search style delete now.
            if (currentNode.getLeftChild() == null && currentNode.getRightChild() != null) {
                if (parentNode == null) {
                    this.rootNode = currentNode.getRightChild();
                } else {
                    // Update parent's pointers
                    if (parentNode.getLeftChild().getData() == currentNode.getData())
                        parentNode.setLeftChild(currentNode.getRightChild());
                    else 
                        parentNode.setRightChild(currentNode.getRightChild());
                }
                return;
            }
            if (currentNode.getRightChild() == null && currentNode.getLeftChild() != null) {
                if (parentNode == null) {
                    this.rootNode = currentNode.getLeftChild();
                }  else {
                    // Update parent's pointers
                    if (parentNode.getLeftChild().getData() == currentNode.getData())
                        parentNode.setLeftChild(currentNode.getLeftChild());
                    else 
                        parentNode.setRightChild(currentNode.getLeftChild());
                }
                return;
            }
     
            if (currentNode.getRightChild() == null && currentNode.getLeftChild() == null) {
                if (parentNode == null) {
                    // Current node is the root node. Set root node for tree to null
                    this.setRootNode(null);
                } else {
                    // Update parent's pointers
                    if (parentNode.getLeftChild().getData() == currentNode.getData())
                        parentNode.setLeftChild(null);
                    else 
                        parentNode.setRightChild(null);
               }
                return;
            }

            // Both right and left children are present. 
            // So find the right most node in the left subtree. And that takes the spot
            // Succession calculation has to start via a traversal.
            // So using a temp node
            TreeNode temp = currentNode.getLeftChild();
            TreeNode parentOfTemp = currentNode;
            while (temp.getRightChild() != null) {
                parentOfTemp = temp;
                temp = temp.getRightChild();
            }
            // Now that the right most node is found
            // Swap data with current node.
            currentNode.setData(temp.getData());
            currentNode.setCenterChild(temp.getCenterChild());
            // Change the parentOfTemp's right pointer to point to leftChild of temp
            parentOfTemp.setRightChild(temp.getLeftChild());
            // Thus the tree has removed the temp node by partly copying over data,
            // and by partly updating it's parent.
            return;
        } else {
            // Number not found. So nothing to do. 
             return;
        }
    }

}
