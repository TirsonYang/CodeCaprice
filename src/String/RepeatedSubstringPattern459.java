package String;

public class RepeatedSubstringPattern459 {

    public static int[] getNext(String s){
        int[] next=new int[s.length()];
        next[0]=0;
        for (int j=0,i=1;i<s.length();i++) {
            while(j>0&&s.charAt(i)!=s.charAt(j)){
                j=next[j-1];
            }
            if (s.charAt(i)==s.charAt(j)){
                next[i]=j+1;
                j++;
            }else{
                next[i]=0;
            }
        }
        return next;
    }

    public static boolean contain(String haystack,String needle){
        int[] next=getNext(needle);
        int j=0;
        for (int i = 0; i < haystack.length(); i++) {
            while(j>0&&haystack.charAt(i)!=needle.charAt(j)){
                j=next[j-1];
            }
            if (haystack.charAt(i)==needle.charAt(j)){
                j++;
            }
            if (j>=needle.length()){
                return true;
            }
        }
        return false;
    }


    public static boolean repeatedSubstringPattern(String s){
        StringBuilder sb=new StringBuilder(s+s);
        sb.delete(0,1);
        sb.delete(sb.length()-1,sb.length());
        return contain(sb.toString(),s);
    }

    public static void main(String[] args) {
        String s="abab";
        System.out.println(repeatedSubstringPattern(s));
    }
}
