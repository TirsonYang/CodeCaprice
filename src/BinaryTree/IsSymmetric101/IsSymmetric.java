package BinaryTree.IsSymmetric101;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class IsSymmetric {
    public static boolean isSymmetric(TreeNode root){
        LinkedList<TreeNode> list=new LinkedList<>();
        list.offer(root);
        TreeNode node;
        while (!list.isEmpty()){
            int size= list.size();
            for (int i = 0; i < size/2; i++) {
                if (list.get(i)!=null) {
                    if (list.get(size-i-1)!=null) {
                        if (list.get(i).val!=list.get(size-i-1).val){
                            return false;
                        }
                    } else {
                        return false;
                    }
                }else {
                    if (list.get(size-i-1)!=null){
                        return false;
                    }
                }
            }
            for (int i = 0; i < size; i++) {
                node=list.poll();
                if (node!=null){
                    list.offer(node.left);
                }
                if (node!=null){
                    list.offer(node.right);
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
//        root.left.left=new TreeNode(3);
        root.left.right=new TreeNode(3);
        root.right=new TreeNode(2);
//        root.right.left=new TreeNode(4);
        root.right.right=new TreeNode(3);
        System.out.println(isSymmetric(root));
    }
}
