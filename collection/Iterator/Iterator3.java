import java.util.HashSet;
import java.util.Iterator;
public class Iterator3 {
    public static void main(String args[]){
        HashSet<Integer> a= new HashSet<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        System.out.println(a.size());
        if(a.contains(5)){
            System.out.println("Present");
        }
        else{
            System.out.println("Absent");
        }
        System.out.println(a.contains(4));
        Iterator<Integer> it=a.iterator();
        while(it.hasNext()){
            // System.out.print(it.next()+",");
            Integer i=it.next();
            if(i>3){
                it.remove();
            }
        }
        // System.out.println();
        System.out.println(a);
    }
}
