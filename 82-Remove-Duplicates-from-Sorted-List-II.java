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
    		ListNode current = head, previous = null;
		boolean isDuplicate = false;
		int val = 0, iterate = 0;
		
		while(current != null && current.next != null) {
			
			if (!isDuplicate && current.val == current.next.val) {
				isDuplicate = true;
				val = current.next.val;
			}
			
			if (!isDuplicate) {
				previous = current;
			}
			
			if(isDuplicate && val != current.next.val) {
				if (previous == null) {
					head = current.next;
					current = head;
					isDuplicate = false;
                    iterate = 0;
					continue;
				}
				else
					previous.next = current.next;
				
				isDuplicate = false;
			}
            if(isDuplicate && val == current.next.val)
				iterate = 0;
			current = current.next;	
			iterate++;
		}
		
		if(previous == null && iterate == 1)
			head = null;
		if (previous != null && isDuplicate == true)
			previous.next = null;
		return head;
    }
}