import java.util.HashSet;
class Hashst3{
    public static void main(String args[]){
        HashSet<Integer> k=new HashSet<Integer>();
        k.add(23);
        k.add(43);
        k.add(12);
        k.add(19);
        k.add(34);
        System.out.println(k);

        System.out.println(k.size());

        System.out.println(k.contains(78));
        System.out.println(k.contains(12));

        for(int i:k){
            System.out.println(i);
        }

        k.remove(43);
        System.out.println(k);

        k.clear();
        System.out.println(k);
    }
}