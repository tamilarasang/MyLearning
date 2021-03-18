
public class LinkedList {
	static class Node{
		int data ;
		Node next;
		
		Node(int a){
			data = a;
			next = null;
		}
		
	}
	
	Node head;
	
	void insert(LinkedList ls, int n,int position) {
		
		if(head ==null) {
			head = new Node(n);
		}else  {
			Node lastnext = new Node(n) ;
			Node last = head;
			if(position != -1) {
				int i =0;
				for(last = head;i < position;i++) {
					last = last.next;
				}
				Node temp = last.next;
				lastnext.next = temp;
				last.next = lastnext;
			}else {
			while(last.next != null) {
				last = last.next;
			}
			last = lastnext;
			}
		}
	}
	
	void print() {
		Node last = head;
		while(last.next != null) {
			System.out.println(last.data + "--> ");
			last = last.next;
		}
	}
	public static void main(String[] args) {
		
		
	}

}
