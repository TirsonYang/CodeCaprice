package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum39 {
     List<List<Integer>> result=new ArrayList<>();
     List<Integer> path=new ArrayList<>();

    public static int Sum(List<Integer> path){
        int sum=0;
        for (int i = 0; i <path.size(); i++) {
            sum=sum+path.get(i);
        }
        return sum;
    }
    public void backtracking(int[] candidates, int target, int startIndex){
        if(Sum(path)==target){
            result.add(new ArrayList<>(path));
            return;
        }else if(Sum(path)>target){
            return;
        }
        for (int i = startIndex; i < candidates.length; i++) {
            path.add(candidates[i]);
            backtracking(candidates,target,startIndex);
            path.removeLast();
            startIndex++;
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target){
        backtracking(candidates,target,0);
        return result;
    }

    public static void main(String[] args) {
        int[] candidates={2,3,5};
        int target=8;
//        System.out.println(combinationSum(candidates,target));
    }
}
