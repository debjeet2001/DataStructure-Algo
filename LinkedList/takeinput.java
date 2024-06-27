import java.util.*;
public class takeinput{

      public static  Node<Integer> takeInput(){
        Scanner s= new Scanner(System.in);
        int data = s.nextInt();
        Node<Integer> head = null;
        while(data != -1){
          Node<Integer> currentNode= new Node<>(data);
          if(head==null){
            head=currentNode;
          }else{
            Node<Integer> tail = head;
            while(tail.next != null){
                tail= tail.next;
            }
            tail.next= currentNode;
          }
          data=s.nextInt();
    }
    return head;
  }



  
}

