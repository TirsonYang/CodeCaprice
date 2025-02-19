package BinaryTree.TraverseTree144_94_145;

import java.util.*;

public class TraverseTree144_94_145 {

    public static void preOrder(TreeNode root,List<Integer> list){
        if (root==null){
            return;
        }
        list.add(root.val);
        preOrder(root.left,list);
        preOrder(root.right,list);
    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        preOrder(root,list);
        return list;
    }

    public static void inOrder(TreeNode root,List<Integer> list){
        if (root==null){
            return;
        }
        inOrder(root.left,list);
        list.add(root.val);
        inOrder(root.right,list);
    }

    public static List<Integer> inorderTraversal(TreeNode root){
        List<Integer> list=new ArrayList<>();
        inOrder(root,list);
        return list;
    }

    public static void postOrder(TreeNode root,List<Integer> list){
        if (root==null){
            return;
        }
        postOrder(root.left,list);
        postOrder(root.right,list);
        list.add(root.val);
    }

    public static List<Integer> postorderTraversal(TreeNode root){
        List<Integer> list=new ArrayList<>();
        postOrder(root,list);
        return list;
    }


    //补充，非递归，迭代法实现二叉树的深度遍历
    public static void PreOrder2(TreeNode root,List<Integer> list) {
        Stack<TreeNode> stack = new Stack<>();
        if (root != null) {
            stack.push(root);
        } else {
            return;
        }
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            list.add(node.val);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
    }

    //后续遍历可以在前序遍历的基础进行操作，将入栈顺序改为先左后右，这样遍历顺序就变成中右左，如果将数组进行翻转，则会变成左右中
    public static void PostOrder2(TreeNode root, List<Integer> list) {
        Stack<TreeNode> stack = new Stack<>();
        if (root!=null){
            stack.push(root);
        }else {
            return;
        }
        while (!stack.isEmpty()){
            TreeNode node=stack.pop();
            list.add(node.val);
            if (node.left!=null){
                stack.push(node.left);
            }
            if (node.right!=null){
                stack.push(node.right);
            }
        }
        Collections.reverse(list);
    }

    //中序遍历
    public static void InOrder2(TreeNode root,List<Integer> list){
        if(root==null){
            return;
        }
        Stack<TreeNode> stack =new Stack<>();
        TreeNode cur=root;
        while(cur!=null||!stack.isEmpty()){
            if (cur!=null){
                stack.push(cur);
                cur=cur.left;
            }else {
                cur=stack.pop();
                list.add(cur.val);
                cur=cur.right;
            }
        }
    }




}
