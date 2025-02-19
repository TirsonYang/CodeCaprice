package StackAndQueue;

import java.util.Stack;

public class RemoveDuplicates1047 {
    public static String removeDuplicates(String s){
        Stack<Character> stack=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (!stack.isEmpty()) {
                if (stack.peek()==s.charAt(i)){
                    stack.pop();
                }else {
                    stack.push(s.charAt(i));
                }
            }else {
                stack.push(s.charAt(i));
            }
        }
        StringBuilder sb=new StringBuilder();
        while (!stack.isEmpty()){
            sb.insert(0,stack.pop());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s="abbaca";
        System.out.println(removeDuplicates(s));
    }
}
