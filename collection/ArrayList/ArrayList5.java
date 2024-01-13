import java.util.ArrayList;
import java.util.Collections;
public class ArrayList5 {
    public static void main(String args[]){
    ArrayList<String> s=new ArrayList<String>();

    //add() method
    s.add("asds");
    s.add("sdfmn");
    s.add("afnj");
    s.add("ldkgjh");

    for(String i : s){
      System.out.println(i);
    }

    //add at specific index
    s.add(4,"fytu");
    
    System.out.println(s);
    //get() method
    System.out.println(s.get(0));
    System.out.println(s.get(2));

    //set ()method
    s.set(1,"trii");
    s.set(3,"rammm");

    //size() method
    System.out.println(s.size());

    //sorting list
    Collections.sort(s);
    System.out.println(s);

    //remove() method;
    s.remove(0);
    s.remove(2);
    System.out.println(s);

    //clear() method
    s.clear();
    System.out.println(s);
    }
}
