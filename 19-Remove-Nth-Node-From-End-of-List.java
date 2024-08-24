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
        int sz = 0;
		int index = 0;
		ListNode current = head;
		
		while (current != null) {
			sz++;
			current = current.next;
		}
		
		current = head;
		index = sz - n;
		
		for(int i = 0; i < sz; i++) {
			if(i == index - 1) {
				if (current.next == null) {
					current.next = null;
				}
                else {
					current.next = current.next.next;
				}
				break;
			}
            else if(index == 0) {
				head = current.next;
				break;
			}
			else {
				current = current.next;
			}
		}
		
		return head;
    }
}