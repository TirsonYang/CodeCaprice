package Array;

import org.w3c.dom.ls.LSOutput;

public class BinarySearch704 {
    public static int search(int[] nums,int target){
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=(left+right)>>1;
            if(nums[mid]<target){
                left=mid+1;
            }else if(target<nums[mid]){
                right=mid-1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] nums={-1,0,3,5,9,12};
        int target=2;
        System.out.println(search(nums,target));
    }
}
