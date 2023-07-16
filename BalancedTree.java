// https://leetcode.com/problems/balanced-binary-tree

import java.util.ArrayList;
import java.util.List;

import utilities.TreeNode;

public class BalancedTree {

    class Solution {
        public boolean isBalanced(TreeNode root) {
            int leftHieght, rightHieght;

            if (root == null) {
                return true;
            }
            List<Integer> i = new ArrayList<Integer>();


            leftHieght = getHieght(root.left);
            rightHieght = getHieght(root.right);
            System.out.println(leftHieght + " " + rightHieght);

            return (Math.abs(leftHieght - rightHieght) > 1)? false : true;
        }

        public int getHieght(TreeNode root) {
            if (root == null) {
                return 0;
            }
            return 1 + Math.max(getHieght(root.left), getHieght(root.right));
        }
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.left.left = new TreeNode(3);
        node.left.left.left = new TreeNode(4);
        node.right = new TreeNode(2);
        node.right.right = new TreeNode(3);
        node.right.right.right = new TreeNode(4);

        BalancedTree bTree = new BalancedTree();
        BalancedTree.Solution soln = bTree.new Solution();

        System.out.println(soln.isBalanced(node));
    }
}
