import java.util.ArrayList;
import java.util.Iterator;
public class Iterator2 {
    public static void main(String args[]){
        ArrayList<String> a=new ArrayList<String>();
        a.add("valvo");
        a.add("harrier");
        a.add("ford");
        a.add("Verna");
        Iterator<String> it=a.iterator();
        //System.out.println(it.next());
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
