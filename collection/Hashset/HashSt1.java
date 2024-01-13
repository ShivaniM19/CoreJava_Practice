import java.util.HashSet;
public class HashSt1{
    // hashset is unindex 
    public static void main(String args[]){
        HashSet<Integer> b= new HashSet<Integer>();
        b.add(12);
        b.add(31);
        b.add(14);
        b.add(98);
        b.add(36);
        System.out.println(b);
        System.out.println(b.size());

        System.out.println(b.contains(23));
        System.out.println(b.contains(14));

        b.remove(98);
        System.out.println(b);

        b.clear();
        System.out.println(b);

        

    }
}