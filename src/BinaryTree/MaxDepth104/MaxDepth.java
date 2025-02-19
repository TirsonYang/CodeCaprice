package BinaryTree.MaxDepth104;

import java.util.LinkedList;
import java.util.Queue;

public class MaxDepth {
    public static int maxDepth(TreeNode root){
        if (root!=null) {
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            TreeNode node;
            int count = 0;
            while (!queue.isEmpty()){
                int size=queue.size();
                count++;
                for (int i=0;i<size;i++) {
                    node=queue.poll();
                    if (node.left!=null){
                        queue.offer(node.left);
                    }
                    if (node.right!=null){
                        queue.offer(node.right);
                    }
                }
            }
            return count;
        } else {
            return 0;
        }
    }
}
