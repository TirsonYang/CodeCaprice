package List.GetIntersectionNode0207;

public class GetIntersectionNode {
    public static ListNode getIntersectionNode(ListNode headA,ListNode headB){
        ListNode dummyheadA=new ListNode(0);
        dummyheadA.next=headA;
        ListNode a=dummyheadA;
        ListNode dummyheadB=new ListNode(0);
        dummyheadB.next=headB;
        ListNode b=dummyheadB;
        ListNode find=null;
        while (a.next!=null){
            a=a.next;
            ListNode p=a;
            while(b.next!=null){
                b=b.next;
                ListNode q=b;
                if (p.val!=q.val){
                    continue;
                }else {
                    find=b.next;
                    p=p.next;
                }
            }
        }
        return find;
    }
}
