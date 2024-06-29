public class eliminateDuplicates{

    public static Node<Integer> removeDuplicates(Node<Integer> head){
        if(head == null)return head;
        if(head.next == null){
            return head;
        }else{
            Node<Integer> current = head.next;
            Node<Integer> previous = head;

            while(current != null){
                if(previous.data != current.data){
                    previous = current;
                    current = current.next;
                }else{
                    previous.next = current.next;
                    current = current.next;
                }
            }
            return head;
        }
    }

    public static void main(String[] args){
        //creating node
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(20);
        Node<Integer> n4 = new Node<>(20);
        Node<Integer> n5 = new Node<>(30);
        Node<Integer> n6 = new Node<>(40);
        Node<Integer> n7 = new Node<>(40);
        Node<Integer> n8 = new Node<>(50);
        Node<Integer> n9 = new Node<>(50);
        Node<Integer> n10 = new Node<>(50);
        Node<Integer> n11 = new Node<>(50);


        //Connecting the nodes.
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;
        n8.next = n9;
        n9.next = n10;
        n10.next = n11;

        PrintLinkedList ll = new PrintLinkedList();
        ll.print(n1);
        System.out.println("--------------------");
        n1 = removeDuplicates(n1);
        ll.print(n1);
    }
}