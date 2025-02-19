package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Combine77 {
    static List<Integer> path=new ArrayList<>();
    static List<List<Integer>> result=new ArrayList<>();
    static void backtracking(int n, int k, int startIndex){
        if (path.size()==k){
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex; i <= n ; i++) {
            path.add(i);
            backtracking(n,k,i+1);             //从这里调用递归，执行完成全部语句，或者遇到return，还是从这里出来
            path.removeLast();                          //每次循环是叶子结点上面的，叶子结点遍历完后，还需要再次弹出一次，也就是回溯
        }                                               //回溯到上一层节点，下一个节点继续遍历其叶子节点
    }
    public static List<List<Integer>> combine(int n,int k){
        backtracking(n,k,1);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(combine(4,2));
    }
}
