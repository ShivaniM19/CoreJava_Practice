import java.util.LinkedList;
public class LL2 {
    public static void main(String args[]){
        LinkedList<Integer> i=new LinkedList<Integer>();
        i.add(23);
        i.add(43);
        i.add(12);
        i.add(53);
        i.add(35);
        i.add(46);

        i.removeLast();
        System.out.println(i);

        i.removeFirst();
        System.out.println(i);

        i.addLast(22);
        System.out.println(i);

        i.addFirst(11);
        System.out.println(i);
       
        System.out.println(i.getFirst());
       
        System.out.println(i.getLast());
        }
}
