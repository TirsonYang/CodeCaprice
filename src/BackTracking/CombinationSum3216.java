package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum3216 {
    List<List<Integer>> result=new ArrayList<>();
    List<Integer> path=new ArrayList<>();

    public void backtracking(int k, int n, int startIndex){
        if (path.size()==k){
            int sum=0;
            for (int i = 0; i < path.size(); i++) {
                sum=sum+ path.get(i);
            }
            if (sum==n){
                result.add(new ArrayList<>(path));
            }
            return;
        }
        for (int i = startIndex; i <= 9; i++) {
            path.add(i);
            backtracking(k,n,i+1);
            path.removeLast();
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n){
        backtracking(k,n,1);
        return result;
    }

    public static void main(String[] args) {
        //System.out.println(combinationSum3(3,9));
    }
}
