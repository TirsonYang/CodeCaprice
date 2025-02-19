package List.RemoveElements203;

public class RemoveElements {

    //不使用虚拟头结点
    public static ListNode removeElements(ListNode head,int val){
        while(head!=null&&head.val==val){
            head=head.next;
        }
        ListNode p=head;
        while(p!=null&&p.next!=null){
            if (p.next.val==val){
                p.next=p.next.next;
            }else {
                p=p.next;
            }
        }
        return head;
    }
    //使用虚拟头结点

    public static ListNode ipRemoveElements(ListNode head,int val){
        ListNode dummyhead=new ListNode();
        dummyhead.next=head;
        ListNode p=dummyhead;
        while(p.next!=null){
            if (p.next.val==val){
                p.next=p.next.next;
            }else {
                p=p.next;
            }
        }
        return dummyhead.next;
    }

    public static void Print(ListNode head){
        ListNode p=head;
        while(p.next!=null){
            p=p.next;
            System.out.print(p.val+" ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ListNode head=new ListNode();
//        head.next=new ListNode(7);
//        head.next.next=new ListNode(8);
//        head.next.next.next=new ListNode(7);
//        head.next.next.next.next=new ListNode(7);
//        head.next.next.next.next.next=new ListNode(6);
//        head.next.next.next.next.next.next=new ListNode(7);
        Print(removeElements(head,7));
    }
}
