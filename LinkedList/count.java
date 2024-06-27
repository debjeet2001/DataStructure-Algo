public class count{
    
    public static int countLL(node<Integer> head){
        if(head == null)return 0;

        node<Integer> temp = head;
        int c = 0;
        while(temp != null){
            c++;
            temp = temp.next;
        }

        return c;
    }
    public static void main(String[] args){
         //creating nodes..
        node<Integer> n1 = new node<>(10);
        node<Integer> n2 = new node<>(20);
        node<Integer> n3 = new node<>(30);

        //connecting nodes.
        n1.next = n2;
        n2.next = n3;

        System.out.println(countLL(n1));
    }
}