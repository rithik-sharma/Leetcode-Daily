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
    public ListNode reverseBetween(ListNode head, int l, int r) {
        if(r == l){
            return head;
        }
        
        ListNode prev = null;
        ListNode curr = head;
        for(int i = 1; i<l; i++){
            prev = curr;
            curr = curr.next;
        }
        ListNode last = prev;
        ListNode end = curr;
        
        for(int j =1; j<=r-l+1 && curr != null; j++ ){
           ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
       if(last != null) last.next = prev;
        else  head = prev;
        
        end.next = curr;
        
        return head;
    }
}