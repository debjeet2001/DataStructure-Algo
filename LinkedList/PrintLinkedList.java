public class PrintLinkedList{
    public static void print(Node<Integer> head){
        if(head == null){
            System.out.println("LINKED-LIST IS EMPTY !");
            return;
        }
        Node<Integer> temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }

        return;

    }
}