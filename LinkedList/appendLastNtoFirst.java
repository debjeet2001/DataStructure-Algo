public class appendLastNtoFirst{
    
    public static Node<Integer> appendlast(Node<Integer> head, int n){
        //Your code goes here
		if(head == null)return head;
		//first step counting the length of the linkedlist.
		int count = 0;
		Node<Integer> current = head;
		Node<Integer> tail = current;
		// traversing the linked list to find the length.
		while(current != null){
			count++;
			current = current.next;
			if(current != null)tail = current;
		}

		if((count-n) == 0)return head;

		if(n == 0)return head;
		current = head;
		int i=0;
		while(i != (count-n-1) ){
			current = current.next;
            i++; 
		}
		tail.next=head;
		head = current.next;
		current.next = null;

		return head;
    }
    public static void main(String[] args){
        //creating node
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);

        //Connecting the nodes.
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        //printing the Linked List first.
        PrintLinkedList ll = new PrintLinkedList();
        ll.print(n1);
        System.out.println("_____________________");
        n1 = appendlast(n1, 3);
        ll.print(n1);
    }
}