/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        // if(head==null || head.next==null || k==0) return head;
        // int length=1;
        // ListNode temp=head;
        // while(temp.next!=null){
        //     temp=temp.next;
        //     length++;
        // }
        // k=k%length;
        // temp.next=head;
        // ListNode curr=head;
        // for(int i=1;i<length-k;i++){
        //     curr=curr.next;
        // }
        // ListNode d=curr.next;
        // curr.next=null;
        // return d;
        if(head==null || head.next==null || k==0) return head;
        int length=1;
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
            length++;
        }
        k=k%length;
        temp.next=head;
        ListNode curr=head;
        for(int i=1;i<length-k;i++){
            curr=curr.next;
        }
        ListNode d=curr.next;
        curr.next=null;
        return d;
    }
}