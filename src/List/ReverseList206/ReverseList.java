package List.ReverseList206;

import java.util.ArrayList;
import java.util.List;

public class ReverseList {

    //使用集合容器存储链表元素，暴力解法
    public static ListNode reverseList(ListNode head){
        ListNode dummyhead=new ListNode();
        dummyhead.next=head;
        ListNode p=dummyhead;
        List<Integer> list=new ArrayList<>();
        while(p.next!=null){
            p=p.next;
            list.add(p.val);
        }
        ListNode q=dummyhead;
        for (int i = list.size()-1; i>=0; i--) {
            q=q.next;
            q.val= list.get(i);
        }
        return dummyhead.next;
    }

    //双指针写法
    public static ListNode ipReverseList(ListNode head){
        ListNode pre=null;
        while(head!=null){
            ListNode temp=head.next;
            head.next=pre;
            pre=head;
            head=temp;
        }
        return pre;
    }

    //递归写法：根据双指针改写

    public static ListNode reverse(ListNode head,ListNode pre){
        if (head==null){
            return pre;
        }
        ListNode temp=head.next;
        head.next=pre;
        pre=head;
        head=temp;
        reverse(head,pre);
        return reverse(head,pre);
    }
    public static ListNode recursionReverseList(ListNode head){
        return reverse(head,null);
    }

}
