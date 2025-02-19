package BinaryTree.Connect117;

import java.util.LinkedList;
import java.util.Queue;

public class Connect {
    public static Node connect(Node root){
        Queue<Node> queue=new LinkedList<>();
        if (root==null){
            return root;
        }else {
            queue.offer(root);
        }
        Node node;
        while (!queue.isEmpty()){
            int size=queue.size();
            for (int i = 0; i < size; i++) {
                node=queue.poll();
                if (i==size-1){
                    node.next=null;
                }else {
                    node.next=queue.peek();
                }
                if (node.left!=null){
                    queue.offer(node.left);
                }
                if (node.right!=null){
                    queue.offer(node.right);
                }
            }
        }
        return root;
    }
}
