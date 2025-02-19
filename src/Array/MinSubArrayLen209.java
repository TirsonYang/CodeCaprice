package Array;

public class MinSubArrayLen209 {
    public static int minSubArrayLen(int target,int[] nums){       //超时
        int count=10000;
        for (int i = 0; i < nums.length; i++) {
            int sum=0;
            for (int j = i; j < nums.length; j++) {
                sum=sum+nums[j];
                if (sum>=target){
                    if (count>j-i){
                        count=j-i+1;
                    }
                    break;
                }
            }
        }
        if (count==10000){
            return 0;
        }else {
            return count;
        }
    }

    public static int ipMinSubArrayLen(int target,int[] nums){
        int j=0;
        int sum=0;
        int count=nums.length+1;
        for (int i = 0; i < nums.length; i++) {
            sum=sum+nums[i];
            while(sum>=target){
                if (count>i-j+1){
                    count=i-j+1;
                }
                sum=sum-nums[j];
                j++;
            }
        }
        if (count>nums.length){
            return 0;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums={1,1,1,1,1,1,1,1};
        int target=11;
        System.out.println(ipMinSubArrayLen(target,nums));
    }
}
