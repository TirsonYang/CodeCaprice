package BinaryTree.IsBalanced110;

public class IsBalanced {

    public static int getHeight(TreeNode root){
        if (root==null){
            return 0;
        }
        int leftHeight = getHeight(root.left);
        if (leftHeight==-1){
            return -1;
        }
        int rightHeight=getHeight(root.right);
        if (rightHeight==-1){
            return -1;
        }
        int result;
        if (Math.abs(leftHeight-rightHeight)>1){
            result=-1;
        }else {
            result=1+Math.max(leftHeight,rightHeight);
        }
        return result;
    }
    public static boolean isBalanced(TreeNode root){
        if (getHeight(root)==-1){
            return false;
        }else {
            return true;
        }
    }


    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(2);
        root.left.left=new TreeNode(3);
        root.left.right=new TreeNode(3);
        root.left.left.left=new TreeNode(4);
        root.left.left.right=new TreeNode(4);
        System.out.println(isBalanced(root));
    }
}
