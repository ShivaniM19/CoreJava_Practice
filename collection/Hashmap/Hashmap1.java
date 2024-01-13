import java.util.HashMap;
public class Hashmap1 {
    public static void main(String args[]){
    HashMap<Integer,String> as=new HashMap<>();
 as.put(1,"asddg");
 as.put(2,"dfjr");
 as.put(3,"nfvjf");
 as.put(4,"dfjhrng");
 as.put(5,"fuere");

 System.out.println(as);

 System.out.println(as.size());

 System.out.println(as.get(2));
 System.out.println(as.get(1));

 for(int i:as.keySet()){
    System.out.println(i+","+as.get(i));
 }

 as.remove(3);
 System.out.println(as);

 as.clear();
 System.out.println(as);
}

}