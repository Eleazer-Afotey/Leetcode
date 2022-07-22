import javax.xml.soap.*;


public class FlattenDll {
	
	
	class Node {
		public int val;
		public Node prev;
		public Node next;
		public Node child;
	}
	
	public static Node flatten(Node head) {
		if(head == null) return head;
		
		Node cur = head;
		
		while(cur != null){
			if(cur.child == null){
				cur = cur.next;
			}
			else{
				Node childtail = cur.child;
				while(childtail.next != null){
					childtail = childtail.next;
				}
				childtail.next = cur.next;
				if(childtail.next != null){
					Node next = cur.next;
					next.prev = childtail;
				}
				
				cur.next = cur.child;
				Node child = cur.child;
				child.prev = cur;
				cur.child = null;
				
			}
		}
		
		return head;
		
	}
	
	
	public static void main(String[] args) {
		
	}
}