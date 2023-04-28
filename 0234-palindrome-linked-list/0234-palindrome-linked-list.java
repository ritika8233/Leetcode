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
    public boolean isPalindrome(ListNode head) {
        
        if(head == null || head.next == null) return true;
        
        ListNode slow = head, fast = head, temp = head;
        
        while(fast != null && fast.next != null){
            temp = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        // System.out.println("Mid" + slow.val);
        
        if(fast == null){
            fast = slow;
            temp.next = null;
        }
        else{
            fast = slow.next;
            temp.next = null;
        }
        
        
        // System.out.println("check" + fast.val);
        
        ListNode curr = head, prev =  null, next = null;
        
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        // System.out.println("reverse" + prev.val);
        
        while(prev != null && fast != null){
            if(prev.val != fast.val)return false;
            prev = prev.next;
            fast = fast.next;
        }
        
        return true;
    }
}