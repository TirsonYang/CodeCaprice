package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinations17 {

    static String[] letters=new String[10];
    static List<String> result=new ArrayList<>();
    static StringBuilder sb=new StringBuilder();

    public static void InitMap(String[] letters){
        letters[0]="";
        letters[1]="";
        letters[2]="abc";
        letters[3]="def";
        letters[4]="ghi";
        letters[5]="jkl";
        letters[6]="mno";
        letters[7]="pqrs";
        letters[8]="tuv";
        letters[9]="wxyz";
    }

    public static void backtracking(String digits, int startIndex){
        if (sb.length()==digits.length()){
            result.add(sb.toString());
            return;
        }
        for (int i = startIndex; i <digits.length() ; i++) {
            for (int j = 0; j < letters[(int)(digits.charAt(i)-'0')].length(); j++) {
                sb.append(letters[(int)(digits.charAt(i)-'0')].charAt(j));
                backtracking(digits,i+1);
                sb.delete(sb.length()-1,sb.length());
            }
        }
    }

    public static List<String> letterCombinations(String digits){
        if (digits.isEmpty()){
            sb.append("");
            result.add(sb.toString());
            return result;
        }
        InitMap(letters);
        backtracking(digits,0);
        return result;
    }

}
