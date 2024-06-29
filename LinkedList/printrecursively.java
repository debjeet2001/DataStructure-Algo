public class printrecursively{
    
    public static void printrecursive(Node<Integer> head){
        if(head == null)return;

        System.out.println(head.data);
        printrecursive(head.next);

    }

    public static void main(String[] args){
        Node<Integer> n1 = new Node<>(20);
        Node<Integer> n2 = new Node<>(30);
        Node<Integer> n3 = new Node<>(40);
        Node<Integer> n4 = new Node<>(50);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        
        printrecursive(n1);

    }
}