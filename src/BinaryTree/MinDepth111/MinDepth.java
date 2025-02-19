package BinaryTree.MinDepth111;

import java.util.LinkedList;
import java.util.Queue;

public class MinDepth {
    public static int minDepth(TreeNode root){
        int count=0;
        if (root==null){
            return 0;
        }else {
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            TreeNode node;
            while (!queue.isEmpty()){
                int size=queue.size();
                count++;
                for (int i = 0; i < size; i++) {
                    node=queue.poll();
                    if (node.right==null&&node.left==null){
                        return count;
                    }
                    if (node.left!=null){
                        queue.offer(node.left);
                    }
                    if (node.right!=null){
                        queue.offer(node.right);
                    }
                }
            }
        }
        return count;
    }
}
