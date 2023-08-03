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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k <= 1){
            return head;
        }
        
        ListNode cur = head;
        int count = 0;
        
        while(cur != null && count < k){
            cur = cur.next;
            count++;
        }
        
        if( k == count){
            cur = reverseKGroup(cur , k);
            
            while(count > 0){
                ListNode temp  = head.next;
                head.next = cur;
                cur = head;
                head = temp;
                count--; 
            }
            head = cur;
        }
        
        return head;
        
    }
}