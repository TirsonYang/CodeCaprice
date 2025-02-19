package String;

import java.util.Arrays;

public class ReverseStrII541 {

    public static String revs(String s,int start,int end){
        char[] chars =s.toCharArray();
        for (int i = start,j=end; i <=(start+end)/2 ; i++,j--) {
            char temp=chars[i];
            chars[i]=chars[j];
            chars[j]=temp;
        }
        return new String(chars);
    }
    public static String reverseStr(String s,int k){
        for (int i = 0; i < s.length(); i=i+2*k) {
            if (s.length()-i<k) {
                s=revs(s,i,s.length()-1);
            }else {
                s=revs(s, i, i + k-1);
            }
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(reverseStr("hyzqyljrnigxvdtneasepfahmtyhlohwxmkqcdfehybknvdmfrfvtbsovjbdhevlfxpdaovjgunjqlimjkfnqcqnajmebeddqsgl",39));
    }
}
