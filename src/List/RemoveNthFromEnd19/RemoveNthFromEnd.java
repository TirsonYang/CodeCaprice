package List.RemoveNthFromEnd19;

public class RemoveNthFromEnd {
    public static ListNode removeNthFromEnd(ListNode head,int n){
        ListNode dummyhead=new ListNode();
        dummyhead.next=head;
        ListNode p=dummyhead;
        int size=0;
        while (p.next!=null){
            p=p.next;
            size++;
        }
        p=dummyhead;
        if (n!=1) {

            for (int i = 0; i < size - n; i++) {
                p=p.next;
            }
            p.next=p.next.next;
        }else {
            while (p.next.next!=null&&p.next!=null){
                p=p.next;
            }
            p.next=null;
        }
        return dummyhead.next;
    }

    public static ListNode ipRemoveNthFromEnd(ListNode head,int n){
        ListNode dummyhead=new ListNode();
        dummyhead.next=head;
        ListNode p=dummyhead;
        ListNode q=dummyhead;
        int m=n;
        while(n>0){
            q=q.next;
            n--;
        }
        while(q.next!=null){
            p=p.next;
            q=q.next;
        }
        if (m==1){
            p.next=null;
        }else {
            p.next=p.next.next;
        }
        return dummyhead.next;
    }
}
