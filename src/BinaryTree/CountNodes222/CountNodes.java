package BinaryTree.CountNodes222;

import java.util.LinkedList;
import java.util.Queue;

public class CountNodes {

    public static int countNodes(TreeNode root){
        Queue<TreeNode> queue=new LinkedList<>();
        int count=0;
        if (root==null){
            return count;
        }else {
            queue.offer(root);
        }
        TreeNode node;
        while (!queue.isEmpty()){
            node=queue.poll();
            count++;
            if (node.left!=null){
                queue.offer(node.left);
            }
            if (node.right!=null){
                queue.offer(node.right);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right=new TreeNode(3);
        root.right.left=new TreeNode(6);
        System.out.println(countNodes(root));
    }

}
