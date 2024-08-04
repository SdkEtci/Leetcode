/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        LinkedList<ListNode> list = new LinkedList<ListNode>();
        
        if (head == null)
            return false; 
            
        while (head.next != null) { 
        	head = head.next;
        	if (list.contains(head))
        		return true;
        	list.add(head); 
        }
        
        return false;
    }
}