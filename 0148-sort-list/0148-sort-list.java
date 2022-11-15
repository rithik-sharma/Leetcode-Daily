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
         if(head == null || head.next == null){
            return head;
        }
        ListNode mid = findMid(head);
        ListNode left = head;
        ListNode right = mid.next;
        mid.next = null;
        
        // recursive calls to sort both halfs
        left = sortList(left);
        right = sortList(right);
        
        // merge
        ListNode result = merge(left, right);
        
        return result;
    }
    
    // find mid
    ListNode findMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    // merge
    ListNode merge(ListNode left, ListNode right){
        if(left == null){
            return right;
        }
        if(right == null){
            return left;
        }
        
        ListNode ans = new ListNode(-1);
        ListNode temp = ans;
        
        // merge 2 sorted Linkedlist
        while(left != null && right != null){
            if(left.val < right.val){
                temp.next = left;
                temp = left;
                left = left.next;
            }else{
                temp.next = right;
                temp = right;
                right = right.next;
            }
        }
        
         if(left != null || right != null)
            temp.next = (left == null) ? right : left;
        
        return ans.next;
    }
    
    
    }
