package StackAndQueue;

import java.util.Stack;

public class EvalRPN150 {

    //本题有一点注意的是，if，else if，else，和分别写开的if if if有区别。
    public static int evalRPN(String[] tokens){
        Stack<String> stack=new Stack<>();
        int result=0;
        for (int i = 0; i < tokens.length; i++) {
            if (!stack.isEmpty()){
                if (tokens[i].equals("+")){
                    int temp1=Integer.parseInt(stack.pop());
                    int temp2=Integer.parseInt(stack.pop());
                    result=temp1+temp2;
                    stack.push(String.valueOf(result));
                }else if (tokens[i].equals("-")){
                    int temp1=Integer.parseInt(stack.pop());
                    int temp2=Integer.parseInt(stack.pop());
                    result=temp2-temp1;
                    stack.push(String.valueOf(result));
                }else if (tokens[i].equals("*")){
                    int temp1=Integer.parseInt(stack.pop());
                    int temp2=Integer.parseInt(stack.pop());
                    result=temp1*temp2;
                    stack.push(String.valueOf(result));
                }else if (tokens[i].equals("/")){
                    int temp1=Integer.parseInt(stack.pop());
                    int temp2=Integer.parseInt(stack.pop());
                    result=temp2/temp1;
                    stack.push(String.valueOf(result));
                } else {
                    stack.push(tokens[i]);
                }
            }else {
                stack.push(tokens[i]);
            }
        }
        return Integer.parseInt(stack.pop());
    }

    public static void main(String[] args) {
        String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(evalRPN(tokens));
    }
}
