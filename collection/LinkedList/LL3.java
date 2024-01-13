import java.util.LinkedList;
public class LL3 {
    public static void main(String args[]){
        LinkedList<Integer> a= new LinkedList<Integer>();
        a.add(24);
        a.add(14);
        a.add(76);
        a.add(35);
        System.out.println(a);

        a.removeFirst();
        System.out.println(a);

        a.removeLast();
        System.out.println(a);

        System.out.println(a.getLast());
        System.out.println(a.getFirst());

        a.addFirst(10);
        System.out.println(a);

        a.addLast(90);
        System.out.println(a);
    }
}
