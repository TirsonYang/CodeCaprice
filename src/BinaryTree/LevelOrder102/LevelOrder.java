package BinaryTree.LevelOrder102;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {
    public static List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> list=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        if (root==null){
            return list;
        }else {
            queue.offer(root);
        }
        TreeNode node=root;
        while(!queue.isEmpty()){
            List<Integer> lst=new ArrayList<>();
            int count=queue.size();
            for (int i= 0;i<count;i++) {
                node=queue.peek();
                lst.add(queue.poll().val);
                if (node.left!=null){
                    queue.offer(node.left);
                }
                if (node.right!=null) {
                    queue.offer(node.right);
                }
            }
            list.add(lst);
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);
        root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(7);
        System.out.println(levelOrder(root));
    }
}
