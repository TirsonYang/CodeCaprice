package String;

import java.util.Arrays;

public class StrStr28 {

    //两层循环暴力破解
    public static int strStr(String haystack,String needle){
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i)==needle.charAt(0)) {
                for (int j = i; j <haystack.length(); j++) {
                    if (haystack.substring(i,j+1).equals(needle)){
                        return i;
                    }
                }
            }
        }
        return -1;
    }

    //KMP算法
    public static int[] getNext(String s){
        int[] next=new int[s.length()];
        next[0]=0;
        int j=0;
        for (int i = 1; i <s.length() ; i++) {
            while(j>0&&s.charAt(j)!=s.charAt(i)){
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

    public static int strStrKMP(String haystack,String needle){
        int[] next=getNext(needle);
        int j=0;
        int i=0;
        for (; i < haystack.length(); i++) {
            while(j>0&&haystack.charAt(i)!=needle.charAt(j)){
                j=next[j-1];
            }
            if (haystack.charAt(i)==needle.charAt(j)){
                j++;
            }
            if(j>=needle.length()){
                return i-needle.length()+1;
            }
        }
        return -1;
    }



    public static void main(String[] args) {
        String haystack="sadbutsad";
        String needle="sad";
        System.out.println(strStrKMP(haystack,needle));
    }
}
