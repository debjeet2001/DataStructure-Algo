import java.util.*;
public class insertRecursive{
    public static Node<Integer> insert(Node<Integer> head){
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();

        if(data == -1)return head;

        Node<Integer> n = new Node<>(data);
        head = n;
        head.next = insert(head.next);
        return head;
    }
    public static void main(String[] args){
        Node<Integer> head = null;
        head = insert(head);
        PrintLinkedList ll = new PrintLinkedList();
        ll.print(head);
    }
}