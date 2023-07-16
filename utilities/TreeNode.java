package utilities;

import javax.swing.text.AsyncBoxView.ChildLocator;

public class TreeNode {
    public int data;
    public TreeNode left, right;

    public TreeNode(int data) {
        this.data = data;
        this.left = this.right = null;
    }

    public TreeNode(int data, TreeNode... chilNodes) {
        this.data = data;
        this.left = chilNodes[0];
        this.right = chilNodes[1];
    }
}
