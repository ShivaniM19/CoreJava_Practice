import java.util.ArrayList;
import java.util.Iterator;
public class Iterator1{
    public static void main(String args[]){
        ArrayList<Integer> n= new ArrayList<Integer>();
        n.add(12);
        n.add(23);
        n.add(3);
        n.add(4);
        n.add(11);
        Iterator<Integer> it= n.iterator();
        while (it.hasNext()) {
            Integer i=it.next();
            if(i<10){               
                it.remove();
            }
            
        }
        System.out.println(n);
    }
}