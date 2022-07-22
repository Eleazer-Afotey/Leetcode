
public class ReverseLinkedList{
	class ListNode {
		
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		
	}
	
	public ListNode reverseList(ListNode head) {
		ListNode curHead = head;
		ListNode prev = null;
		ListNode next = null;
		
		while(curHead != null){
			next = curHead.next;
			curHead.next = prev;
			prev = curHead;
			curHead = next;
		}
		return prev;
	}
	
	
	
	public static void main(String[] args) {
		
	}
	

	
}

