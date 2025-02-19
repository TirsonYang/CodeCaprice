package BinaryTree.LevelOrder429;

import java.util.*;

public class LevelOrder {
    public static List<List<Integer>> levelOrder(Node root){
        List<List<Integer>> list=new ArrayList<>();
        Queue<Node> queue=new LinkedList<>();
        if (root==null){
            return list;
        }else {
            queue.offer(root);
        }
        Node node=root;
        while (!queue.isEmpty()){
            int size=queue.size();
            List<Integer> lst = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                node=queue.poll();
                if (node.children!=null) {
                    for (int j = 0; j < node.children.size(); j++) {
                        queue.offer(node.children.get(j));
                    }
                }
                lst.add(node.val);
            }
            list.add(lst);
        }
        return list;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        List<Node> list1=new ArrayList<>();
        list1.add(new Node(3));
        list1.add(new Node(2));
        list1.add(new Node(4));
        root.children=list1;
        List<Node> list2=new ArrayList<>();
        list2.add(new Node(5));
        list2.add(new Node(6));
        root.children.get(0).children=list2;
        System.out.println(levelOrder(root));
    }

}
