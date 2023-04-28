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
    public ListNode removeNthFromEnd(ListNode head, int remove) {
        
        if(head == null) return null;
        
        ListNode curr = head, prev = null;
        int n = 0;
        
        while(curr != null){
            n++;
            curr = curr.next;
        }
        
        int remove_ind = n - remove;
        
        if(remove_ind == 0) return head.next;
        
        curr = head;
        int c = 1;
        
        while(curr != null && remove_ind >= c){
            prev = curr;
            curr = curr.next;
            c++;
        }
        
        if(curr == null) prev.next = null;
        else prev.next = curr.next;
        
        return head;
    }
}