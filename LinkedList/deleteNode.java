public class deleteNode{


    public static Node<Integer> delete(Node<Integer> head, int pos){
        // Write your code here.
		if(head == null)return head;
		//if we want ot remove the head node.
		if(pos == 0){
			head = head.next;
			return head;
		}
		int count =0;
		Node<Integer> currentNode = head;
		while(count != pos-1 && currentNode != null){
			count++;
			currentNode = currentNode.next;
		}
		if(currentNode == null){
            return head;
        }else{
            if(currentNode.next == null){
                return head;
            }else{
                currentNode.next = currentNode.next.next;
            }
        }
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

        //creating the object of printing linked-list.

        PrintLinkedList ll = new PrintLinkedList();
        ll.print(n1);
        n1=delete(n1,3);
        System.out.println("------------------");
        ll.print(n1);

    }
}