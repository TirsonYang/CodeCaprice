package StackAndQueue;

import java.util.Stack;

public class IsValid20 {
    public static boolean isValid(String s){
        Stack<Character> stack=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='['||s.charAt(i)=='('||s.charAt(i)=='{'){
                stack.push(s.charAt(i));
                continue;
            }
            if (s.charAt(i)==']') {
                if (stack.isEmpty()){
                    return false;
                }else {
                    if (stack.pop()!='['){
                        return false;
                    }
                }
            }
            if (s.charAt(i)=='}') {
                if (stack.isEmpty()){
                    return false;
                }else {
                    if (stack.pop()!='{'){
                        return false;
                    }
                }
            }
            if (s.charAt(i)==')') {
                if (stack.isEmpty()){
                    return false;
                }else {
                    if (stack.pop()!='('){
                        return false;
                    }
                }
            }
        }
        if (stack.isEmpty()){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isValid("("));
    }

}
