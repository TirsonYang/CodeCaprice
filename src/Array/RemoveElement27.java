package Array;

import java.util.ArrayList;
import java.util.Objects;

public class RemoveElement27 {
    public static int removeElement(int[] nums,int val){
        ArrayList<Integer> list=new ArrayList<>();
        int k=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=val){
                list.add(nums[i]);
                k++;
            }
        }
        for (int i = 0; i <k; i++) {
            nums[i]= list.get(i);
        }
        return k;
    }

    //以下为改良版本，双指针思路
    public static int ipRemoveElement(int[] nums,int val){
        //双指针的作用是将两个for循环用一次for循环来完成
        //用原来的nums数组作为新数组
        //i为快指针，遍历旧数组nums
        //k为慢指针，指向新数组的下标，用来覆盖旧数组的元素，起到删除的作用
        int k=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }



    public static void main(String[] args) {

    }
}
