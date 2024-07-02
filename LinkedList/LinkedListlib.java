import java.util.*;
public class LinkedListlib{

   

    public static void main(String[] args){
        Student s1 = new Student("Debjeet Chakraborty", 2011200, "b.tech in CSBS");
        Student s2 = new Student("Anirudh Jalan", 2002002, "B.tech in CSBS");
        Student s3 = new Student("Soumyajit Nag", 20020, "B.tech in CSBS");
        LinkedList<Student> s = new LinkedList<>();
        s.add(s1);
        s.add(s2);
        s.add(s3);
        //System.out.println(s);
        s1.setAge(22);
        s1.setAge(23);
        s1.setAge(22);
        
        for(int i = 0; i<s.size(); i++){
            

        }
        
       
    }
}