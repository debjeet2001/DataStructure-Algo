public class incrementll{
    public static void increment(node<Integer> head){
        node<Integer> temp = head;
        while(temp!=null){
            temp.data++;
            temp=temp.next;
        }
        return;
    }

    public static void print(node<Integer> head){
        node<Integer> temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public static void main(String[] args){
        //creating nodes..
        node<Integer> n1 = new node<>(10);
        node<Integer> n2 = new node<>(20);
        node<Integer> n3 = new node<>(30);

        //connecting nodes.
        n1.next = n2;
        n2.next = n3;

        increment(n1);
        print(n1);

    }
}