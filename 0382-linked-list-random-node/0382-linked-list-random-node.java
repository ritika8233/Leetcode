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

    ListNode curr1;
    
    public Solution(ListNode head) {
        curr1 = head;
    }
    
    public int getRandom() {
        int c = 0, res = 0;
        ListNode curr = curr1;
        
        while(curr != null){
            c++;
            
            if((int)(Math.random() * c) == 0)res = curr.val;
            curr=curr.next;
        }
        
        return res;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */