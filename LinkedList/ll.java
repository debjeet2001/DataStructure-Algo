public class ll{

    public static void printll(node<Integer> n){
        if(n ==null){
            System.out.println("Empty Linked-List");
            return;
        }
        node<Integer> temp = n;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        return;
    }

    public static node<Integer> createll(){
        //creating the nodes.
        node<Integer> n1 = new node<>(10);
        node<Integer> n2 = new node<>(20);
        node<Integer> n3 = new node<>(30);
        node<Integer> n4 = new node<>(40);
        
        //Connecting the nodes.
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        //returning the node reference.
        return n1;
    }
    public static void main(String[] args){
        node<Integer> n1;
        //we want linkedList like 10->20->30->40.
        n1 = createll();
        System.out.println(n1);
        printll(n1);
        System.out.println(n1.data);
                
    }       
}