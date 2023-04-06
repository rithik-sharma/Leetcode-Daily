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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        // traversing till a - 1 in list1
        ListNode h1 =  list1;
        for( int i = 0  ; i < a -1; i++ ){
            h1 = h1.next;
        }
        
        // traversing till b + 1 in list1
        ListNode h2 = list1;
        
        for( int i = 0 ; i < b + 1 ; i++ ){
            h2 = h2.next;
        }
        
        // connecting the ( a - 1 )th node to the head of the second list 
        h1.next = list2;
        
        // finding the tail of the list2
        ListNode list2_tail = list2;
        
        while( list2_tail.next != null ){
            list2_tail = list2_tail.next;
        }
        
        // now connneting the tail  of the list2 to the b+1 th node of the list1
        
        list2_tail.next = h2;
        
        return list1;
        

    }
}