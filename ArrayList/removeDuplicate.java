import java.util.*;
public class removeDuplicate{

    public static void duplicate(ArrayList arr){
        for(int i = 0; i<arr.size(); i++){
            int duplicate = 0;
           
            for(int j=0; j<arr.size(); j++){
                if(arr.get(j) == arr.get(i))duplicate++;
            }
            if(duplicate >= 2)arr.remove(i);
        }
    }

    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(20);
        arr.add(10);
        System.out.println(arr); 
        //our job is to remove the duplicate.
        duplicate(arr);
        Collections.sort(arr);
        System.out.println(arr);

    }
}