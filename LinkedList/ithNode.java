public class ithNode{
    
    public static void printIthNode(node<Integer> head, int i){
        if(head == null)return;
        node<Integer> temp = head;
        int j = 0;
        while(j != i && temp != null){
            temp = temp.next;
            j++;
        }
        if(temp != null){
            System.out.println(temp.data);
        }
        return;
    }

    public static void main(String[] args){
        node<Integer> n1 = new node<>(10);
        node<Integer> n2 = new node<>(20);
        node<Integer> n3 = new node<>(30);
        node<Integer> n4 = new node<>(40);
 
        //connecting nodes.
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

       printIthNode(n1,1);
    }
}