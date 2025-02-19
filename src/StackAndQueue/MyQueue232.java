package StackAndQueue;

import java.util.Stack;

public class MyQueue232 {

    static Stack<Integer> stack1;
    static Stack<Integer> stack2;
    public  MyQueue232(){
        stack1=new Stack<>();
        stack2=new Stack<>();
    }

    public static void push(int x){
        stack1.push(x);
    }

    public static int pop(){
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public static int peek(){
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public static boolean empty(){
        if (stack1.empty()&& stack2.empty()){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {

    }
}
