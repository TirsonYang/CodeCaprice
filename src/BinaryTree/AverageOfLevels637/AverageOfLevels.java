package BinaryTree.AverageOfLevels637;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevels {
    public static List<Double> averageOfLevels(TreeNode root){
        List<Double> list=new ArrayList<>();
        Queue<TreeNode> queue =new LinkedList<>();
        if (root==null){
            return list;
        }else {
            queue.offer(root);
        }
        TreeNode node;
        while(!queue.isEmpty()){
            int size=queue.size();
            double sum=0;
            for (int i = 0; i < size; i++) {
                node=queue.poll();
                sum=sum+node.val;
                if (node.left!=null){
                    queue.offer(node.left);
                }
                if (node.right!=null){
                    queue.offer(node.right);
                }
            }
            list.add(sum/size);
        }
        return list;
    }

    public static void main(String[] args) {

    }
}
