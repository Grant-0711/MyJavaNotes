package org.hxl.algorithm;

/**
 * @author Grant
 * @create 2021-06-21 11:06
 */
public class TestAlgorithm {
    public static void main(String[] args) {
//        int[] nums = new int[]{1,4,6,9,3,7,2,8,22};
//        QuickSort.qSort(nums,0,nums.length-1);
//        for (int num : nums) {
//            System.out.println(num);
//        }
/*
* 1
* 2 3
* 4 5 6 7
* */

        TreeNode tree1 = new TreeNode(1);
        tree1.left = new TreeNode(2);
        tree1.right = new TreeNode(3);
        tree1.left.left = new TreeNode(4);
        tree1.left.right = new TreeNode(5);
        tree1.right.left = new TreeNode(6);
        tree1.right.right = new TreeNode(7);

        printTree(tree1);
        invertTree(tree1);
        printTree(tree1);

    }

    public static TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode right = invertTree(root.right);
        TreeNode left = invertTree(root.left);
        root.left = right;
        root.right = left;
        return root;
    }

    public static void printTree(TreeNode root){
        if (root == null) return;
        System.out.println(root.val+"");
        if (root.left != null) printTree(root.left);
        if (root.right != null) printTree(root.right);
    }
}
