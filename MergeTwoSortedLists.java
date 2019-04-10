//21. Merge Two Sorted Lists

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;
        ListNode res = new ListNode(-1);
        ListNode head = res;
        while(l1!=null && l2!=null){
            if(l1.val <= l2.val){
                res.next = l1;
                l1 = l1.next;
            }else{
                res.next = l2;
                l2 = l2.next;
            }
            res = res.next;
        }
        if(l1 == null) {
            res.next = l2;
        }
        else {
            res.next = l1;
        }
        return head.next;
    }

    public static void main(String[] args) {
        MergeTwoSortedLists msl = new MergeTwoSortedLists();
    }
}
