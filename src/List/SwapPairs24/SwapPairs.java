package List.SwapPairs24;

public class SwapPairs {
    public static ListNode swapPairs(ListNode head){
        ListNode dummyhead=new ListNode();
        dummyhead.next=head;
        ListNode p=dummyhead;
        while(p.next!=null&&p.next.next!=null){
            ListNode post=p.next;
            ListNode temp=post.next;
            post.next=temp.next;
            temp.next=post;
            p.next=temp;
            p=p.next.next;
        }
        return dummyhead.next;
    }
}
