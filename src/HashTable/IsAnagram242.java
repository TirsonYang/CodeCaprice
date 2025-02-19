package HashTable;

public class IsAnagram242 {
    public static boolean isAnagram(String s,String t){
        if (s.length()!=t.length()){
            return false;
        }
        int[] nums=new int[26];
        for (int i = 0; i < s.length(); i++) {
            nums[s.charAt(i)%26]++;
            nums[t.charAt(i)%26]--;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String s="car";
        String t="cat";
       System.out.println(isAnagram(s,t));
    }
}
