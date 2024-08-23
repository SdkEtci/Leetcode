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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
		int total = 0;
		int remainder = 0;
		ListNode result = new ListNode(-1);
		ListNode temp = new ListNode();

		while (l1 != null || l2 != null) {

			if (l1 == null) {
				total = l2.val + remainder;
				l2 = l2.next;
			}
			else if (l2 == null) {
				total = l1.val + remainder;
				l1 = l1.next;
			}
			else {
				total = l1.val + l2.val + remainder;
				l1 = l1.next;
				l2 = l2.next;
			}

			if (total > 9) {
				remainder = 1;
				arrList.add(total%10);
			}
			else {
				remainder = 0;
				arrList.add(total);
			}
		}
        
        if (remainder == 1)
			arrList.add(1);

		if (arrList.isEmpty())
			result = new ListNode(0);

		else {
			for (int num : arrList) {
				if (result.val == -1) {
					result = new ListNode(num);
					temp = result;
				}
				else {
					while (temp.next != null) {
						temp = temp.next;
					}
					temp.next = new ListNode(num);
				}
			}
		}
		return result;
    }
}