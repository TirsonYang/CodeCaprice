package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum240 {
    static List<Integer> path=new ArrayList<>();
    static List<List<Integer>> result=new ArrayList<>();

    public static int Sum(List<Integer> list){
        int sum=0;
        for (int i = 0; i < list.size(); i++) {
            sum=sum+list.get(i);
        }
        return sum;
    }

    public static void backtracking(int[] candidates, int target, int startIndex,boolean[] used){
        if (Sum(path)==target){
            result.add(new ArrayList<>(path));
            return;
        } else if (Sum(path)>target) {
            return;
        }
        for (int i = startIndex; i < candidates.length; i++) {
            if (i>0&&(candidates[i]==candidates[i-1])&&used[i-1]==false){
                continue;
            }
            used[i]=true;
            path.add(candidates[i]);
            backtracking(candidates,target,i+1,used);
            path.removeLast();
            used[i]=false;
        }
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target){
        Arrays.sort(candidates);
        boolean[] used=new boolean[candidates.length];
        backtracking(candidates,target,0,used);
        return result;
    }

    public static void main(String[] args) {
        int[] candidates={10,1,2,7,6,1,5};
        int target=8;
        System.out.println(combinationSum2(candidates,target));
    }

}
