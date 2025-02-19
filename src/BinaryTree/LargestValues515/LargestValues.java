package BinaryTree.LargestValues515;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LargestValues {

    public static int researchMax(List<Integer> list){
        int max=list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (max<list.get(i)){
                max=list.get(i);
            }
        }
        return max;
    }
    public List<Integer> largestValues(TreeNode root){
        List<Integer> list=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        if (root==null){
            return list;
        }else {
            queue.offer(root);
        }
        TreeNode node;
        while (!queue.isEmpty()){
            List<Integer> lst = new ArrayList<>();
            int size= queue.size();
            for (int i = 0; i < size; i++) {
                node=queue.poll();
                if (node.left!=null){
                    queue.offer(node.left);
                }
                if (node.right!=null){
                    queue.offer(node.right);
                }
                lst.add(node.val);
            }
            list.add(researchMax(lst));
        }
        return list;
    }
}
