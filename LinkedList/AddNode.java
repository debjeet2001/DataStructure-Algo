public class AddNode{

    public static Node<Integer> insertNode(Node<Integer> head, int index, int data){
        if(head==null){
            Node<Integer> n = new Node<>(data);
            return n;
        }

        Node<Integer> n = new Node<>(data);
        if(index == 0){
            n.next = head;
            head = n;
            return head;
        }
        Node<Integer> temp = head;
        int count = 0;
        while(count != index-1 && temp != null){
            count++;
            temp = temp.next;
        }

        if(temp != null){
            n.next = temp.next;
            temp.next = n;
            return head;
        }else{
            return head;
        }
    }
    
    public static void print(Node<Integer> head){
        if(head == null )return;
        Node<Integer> temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        return;
    }

    public static Node<Integer> add(Node<Integer> head, int data){
        Node<Integer> currentNode = new Node<>(data);
        if(head == null){
            head = currentNode;
            return head;
        }
        Node<Integer> temp = head;
        while(temp.next != null){
            temp=temp.next;
        }
        temp.next = currentNode;
        return head;
    }

    public static void main(String[] args){
        Node<Integer> head= null;
        head = add(head, 10);
        head = add(head,20);
        head = add(head,30);
        head = add(head, 40); 
        print(head);
        System.out.println("--------");
        head = insertNode(head, 1, 5 );
        print(head);


    }
}