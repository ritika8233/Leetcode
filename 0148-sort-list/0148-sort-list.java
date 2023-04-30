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
    public ListNode sortList(ListNode head) {
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        while(head != null){
            arr.add(head.val);
            head = head.next;
        }
        
        Collections.sort(arr);
        
        ListNode dummy = new ListNode(), temp = dummy;
        
        for(int i = 0; i < arr.size(); i++){
            
            ListNode node = new ListNode(arr.get(i));
            temp.next = node;
            temp = temp.next;
        }
        
        return dummy.next;
    }
}