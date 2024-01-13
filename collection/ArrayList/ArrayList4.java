import java.util.ArrayList;
import java.util.Collections;
public class ArrayList4 {
   public static void main(String args[]){
    ArrayList<Integer> a=new ArrayList<Integer>();

    //add () method
    a.add(12);
    a.add(223);
    a.add(21);
    a.add(43);
    System.out.println(a);

    //sorting of element
    Collections.sort(a);

    //get ()method
    System.out.println(a.get(0));
    System.out.println(a.get(1));
    
    //set() method
    a.set(2,54);
    a.set(1,13);

    System.out.println(a);
    //size() method
    System.out.println(a.size());
    
    //remove() method
    a.remove(2);
    
    System.out.println(a);

   //clear() method
   a.clear();
   
    System.out.println(a);
   } 
}
