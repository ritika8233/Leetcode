/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        if(head == null)return head;
        
        ListNode slow = head, fast = head;
        
        if(head.next != null){
            
            slow = head.next;
            fast = head.next.next;
        }
        
        int flag = 0;
        
        while(fast != null && fast.next != null){
            if(slow == fast){
                flag = 1;
                break;
            }
            
            slow = slow.next;
            fast = fast.next.next;
        }
        
        slow = head;
        
        while(fast != null && fast.next != null){
            
            if(slow == fast)return slow;
            slow = slow.next;
            fast = fast.next;
            
        }
        
        return null;
        
    }
}