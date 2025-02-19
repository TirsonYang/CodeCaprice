package HashTable;

public class TwoSum1 {
    public static int[] twoSum(int[] nums,int target){
        int[] newNums=new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j]==target){
                    newNums[0]=i;
                    newNums[1]=j;
                    return newNums;
                }
            }
        }
        return newNums;
    }
}
