
public class PairSwapLinkedList {
	
	
	public static void main(String args[]){
		
		Node head=new PairSwapLinkedList().createLinkedList();
		
		printLinkedList(head);
		
		System.out.println("After");

		
		head=reverse(head);
		
		

		printLinkedList(head);
		/*
		SwapNodes(head,23,67);

		pairWiseSwap(head);
		System.out.println("After=>");
		printLinkedList(head);
		
		*/
	}

	private static Node reverse(Node head) {
		
		Node previous=null;
		Node current=head;
		Node next;
		
		
		while(current !=null){
			
			 next=current.next;
			 current.next=previous;
			 previous=current;
			 current=next;
			
			
		}
		
		head=previous;
		
		return head;
		
		
	}

	private static void SwapNodes(Node head, int num1, int num2) {
		
		Node node1=null;
		Node node2=null;
		
         while(head!=null){
			
			System.out.println("Data"+head.data);
			if(head.data == num1){
				node1=head;
			}
			
			if(head.data == num2){
				node2=head;
			}
			
			head=head.next;
			
		}
         
        System.out.println("Node1:"+node1.data);
        System.out.println("Node2:"+node2.data);
        
        Node temp=node2;
        node2.next=node1.next;
        node1.next=temp.next;
		
	}

	private static void pairWiseSwap(Node head) {
		// TODO Auto-generated method stub
		
		if(head !=null && head.next !=null){
		   swap(head,head.next);
		   pairWiseSwap(head.next.next);
		}
		
		
		
	}

	private static void swap(Node first, Node second) {
		
		int temp=second.data;
		second.data=first.data;
		first.data=temp;
		

		
	}

	private static void printLinkedList(Node node) {
		
		while(node!=null){
			
			System.out.println("Data"+node.data);
			node=node.next;
			
		}
		
	}

	private  Node createLinkedList() {
		
		Node n4=new Node(23,null);
		Node n3=new Node(34,n4);
		Node n2=new Node(45,n3);
		Node n1=new Node(67,n2);
		Node head=new Node(99,n1);
		
		return head;
		
	}
	
	class Node{
		
		private int data;
		private Node next;
		
		public Node(int data, Node next){
			this.next=next;
			this.data=data;
		}
		
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
		
		
		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}
		
	}

}
