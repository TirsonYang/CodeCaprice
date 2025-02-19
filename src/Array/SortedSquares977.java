package Array;

import java.util.Arrays;

public class SortedSquares977 {
    public static int[] sortedSquares(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            nums[i]=nums[i]*nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length-1; j++) {
                if (nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        return nums;
    }

    public static int[] ipSortedSquares(int[] nums){
        int i=0;
        int j=nums.length-1;
        int[] result=new int[nums.length];
        int k=nums.length-1;
        while(i<=j){
            int a=nums[i]*nums[i];
            int b=nums[j]*nums[j];
            if (a>b){
                result[k]=a;
                k--;
                i++;
            } else {
                result[k]=b;
                k--;
                j--;
            }
        }
        return result;
    }



    public static void main(String[] args) {
        int[] nums={-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
}
