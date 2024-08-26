/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node fakeStart = new Node(0);
		Node currCopy = fakeStart;
		Node currHead = head;
		Node current1 = null, current2 = null;
		Node nodeRandom = null;
		int size = 0;
		
		if(head == null)
			return null;
		
		// Copying val & next
		while (currHead != null) {
			currCopy.next = new Node(currHead.val);
			currHead = currHead.next;
			currCopy = currCopy.next;
			size++;
		}
		
		currHead = head;
		currCopy = fakeStart.next;
		current1 = head;
		current2 = fakeStart.next;
		
        // Copying random
		while(currHead != null) {
			nodeRandom = currHead.random;
			
			for(int i = 0; i < size; i++) {
				if (nodeRandom == null)
					currCopy.random = null;
				else if(nodeRandom == current1) {
					currCopy.random = current2;
					break;
				}
				else {
					current1 = current1.next;
					current2 = current2.next;
				}
			}
			current1 = head;
			current2 = fakeStart.next;;
			currHead = currHead.next;
			currCopy = currCopy.next;
		}
		
		return fakeStart.next;
    }
}