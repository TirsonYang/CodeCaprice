package BinaryTree.RightSideView199;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightSideView {
    public static List<Integer> rightSideView(TreeNode root){
        List<Integer> list=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null){
            return list;
        }else {
            queue.offer(root);
        }
        TreeNode node=root;
        while (!queue.isEmpty()){
            int size= queue.size();
            for (int i = 0; i < size; i++) {
                node=queue.peek();
                if (i==size-1){
                    list.add(node.val);
                }
                queue.poll();
                if (node.left!=null){
                    queue.offer(node.left);
                }
                if (node.right!=null){
                    queue.offer(node.right);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.right=new TreeNode(5);
        root.right.right=new TreeNode(4);
        System.out.println(rightSideView(root));
    }
}
