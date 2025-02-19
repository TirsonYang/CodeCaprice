package BinaryTree.BinaryTreePaths257;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {

    public static int treePaths(TreeNode root,List<String> list){
        if (root==null){
            return -1;
        }
        StringBuilder sb=new StringBuilder();
        if (list.isEmpty()){
            sb.append(root.val);
        }else {
            sb.append("->");
            sb.append(root.val);
        }
        list.add(sb.toString());
        int leftVal=treePaths(root.left,list);
        int rightVal=treePaths(root.right,list);
        return 1;
    }
    public static List<String> binaryTreePaths(TreeNode root){
        List<String> list=new ArrayList<>();
        return list;
    }
}
