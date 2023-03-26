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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode dummy=new ListNode();
        dummy.next=head;
        ListNode prev=dummy;

        while(head!=null){
            if(head.next!=null && head.val==head.next.val){
                while(head.next!=null && head.val==head.next.val){
                    head=head.next;
                }
                prev.next=head.next;
            }
            else{
                prev=prev.next;   
            }
            head=head.next;
            
        }
        return dummy.next;


        
//         ListNode dummy = new ListNode(-1);
//         ListNode itr = dummy;
//         itr.next = head;  // potential unique element
//         ListNode cur = head.next;
        
//         while(cur != null){
//            boolean isLoopRun = true;
//             while(cur != null && itr.next.val == cur.val ){
//                 isLoopRun = true;
//                 cur = cur.next;
//             }
            
//             if(isLoopRun){
//                 itr.next = cur;
//             }else{
//                 itr = itr.next;
//             }
            
//             if(cur != null) cur = cur.next;
            
//         }
        
//         return dummy;
    
    }
}