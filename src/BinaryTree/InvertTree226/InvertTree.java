package BinaryTree.InvertTree226;

import java.util.LinkedList;
import java.util.Queue;

public class InvertTree {
    public static TreeNode invertTree(TreeNode root){
        if (root==null){
            return root;
        }else {
            Queue<TreeNode> queue=new LinkedList<>();
            queue.offer(root);
            TreeNode node;
            while(!queue.isEmpty()){
                int size= queue.size();
                for (int i = 0; i < size; i++) {
                    node=queue.poll();
                    if (node.left!=null){
                        queue.offer(node.left);
                    }
                    if (node.right!=null){
                        queue.offer(node.right);
                    }
                    TreeNode temp=node.right;
                    node.right=node.left;
                    node.left=temp;
                }
            }
            return root;
        }
    }

    //前序遍历
    public static TreeNode preInvertTree(TreeNode root){
        TreeNode node=root;
        if (node==null){
            return node;
        }else {
            TreeNode temp=node.right;
            node.right=node.left;
            node.left=temp;
            preInvertTree(root.left);
            preInvertTree(root.right);
        }
        return root;
    }

    //中序遍历
    public static TreeNode inInvertTree(TreeNode root){
        TreeNode node=root;
        if (node==null){
            return node;
        }else {
            preInvertTree(root.left);
            TreeNode temp=node.right;
            node.right=node.left;
            node.left=temp;
            preInvertTree(root.left);
        }
        return root;
    }

    //后续遍历
    public static TreeNode postInvertTree(TreeNode root){
        TreeNode node=root;
        if (node==null){
            return node;
        }else {
            preInvertTree(root.left);
            preInvertTree(root.right);
            TreeNode temp=node.right;
            node.right=node.left;
            node.left=temp;
        }
        return root;
    }

}
