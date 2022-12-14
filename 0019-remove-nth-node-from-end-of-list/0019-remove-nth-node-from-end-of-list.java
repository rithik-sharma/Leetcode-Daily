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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur = head;
        int len = 1;
        
        while(cur.next != null){
            cur = cur.next;
            len++;
        }
        
        if(len == 1 && n == 1){
            return null;
        }
        
    int count = len - n;
      cur = head;
      while(count > 1){
          cur = cur.next;
          count --;
      }
        if(count == 0){
            head = head.next;
            return head;
        }
        cur.next = cur.next.next;
        
        return head;
    }
}