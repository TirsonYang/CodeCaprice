package BinaryTree.LevelOrderBottom107;

import java.util.*;

public class LevelOrderBottom {
    public static List<List<Integer>> levelOrderBottom(TreeNode root){
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
        Collections.reverse(list);
        return list;
    }
}
