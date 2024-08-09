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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ListNode list3 = new ListNode();

        if (list1 == null && list2 == null) {
            return null;
        }

        while (list1 != null) {
        	arr.add(list1.val);
        	list1 = list1.next;
        }
        while (list2 != null) {
        	arr.add(list2.val);
        	list2 = list2.next;
        }
        if (arr.isEmpty() != true)
            arr.sort(null);
        else 
            return list3;
        
        
        ListNode temp = new ListNode();
        temp.val = arr.get(0);

        list3 = temp;
        
        for (int i = 1; i < arr.size(); i++) {
        	temp.next = new ListNode(arr.get(i));
        	temp = temp.next;
        }
        
        return list3;
    }
}