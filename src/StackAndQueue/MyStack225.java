package StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack225 {

    static Queue<Integer> queue1;
    static Queue<Integer> queue2;

    public MyStack225(){
        queue1=new LinkedList<>();
        queue2=new LinkedList<>();
    }

    public static void push(int x){
        if (queue1.isEmpty()){
            queue1.offer(x);
            while (!queue2.isEmpty()){
                queue1.offer(queue2.poll());
            }
        } else if (queue2.isEmpty()) {
            queue2.offer(x);
            while (!queue1.isEmpty()){
                queue2.offer(queue1.poll());
            }
        }
    }

    public static int pop(){
        if(queue1.isEmpty()){
            return queue2.poll();
        }else {
            return queue1.poll();
        }
    }

    public static int top(){
        if(queue1.isEmpty()){
            return queue2.peek();
        }else {
            return queue1.peek();
        }
    }

    public static boolean empty(){
        if (queue1.isEmpty()&& queue2.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
}
