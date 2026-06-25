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
    int find( ListNode head , int target){
        if ( head == null ){
            return 0;
        }
        int n = find( head.next, target);
        if ( n == target ){
            head.next = head.next.next;
        }
        return n+1;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int temp = find(head, n);
        if ( temp == n){
            head = head.next;
        }
        return head;
    }
}