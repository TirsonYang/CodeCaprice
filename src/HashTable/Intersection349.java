package HashTable;

import java.util.*;

public class Intersection349 {
    public static int[] intersection(int[] nums1,int[] nums2){
        int[] nums=new int[1005];
        for (int i = 0; i < nums1.length; i++) {
            nums[nums1[i]]=1;
        }

        Set<Integer> set=new HashSet<>();
        for (int i = 0; i < nums2.length; i++) {
            if (nums[nums2[i]]==1){
                set.add(nums2[i]);
            }
        }
        Integer[] re=new Integer[set.size()];
        set.toArray(re);
        return Arrays.stream(re).mapToInt(Integer::valueOf).toArray();
    }


    public static void main(String[] args) {
        int[] nums1={1,2,2,1};
        int[] nums2={2,2};
        System.out.println(Arrays.toString(intersection(nums1,nums2)));
    }
}
