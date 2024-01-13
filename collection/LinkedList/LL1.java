import java.util.LinkedList;
public class LL1{
    public static void main(String args[]){
  LinkedList<String> s=new LinkedList<String>();
  s.add("volvo");
  s.add("foed");
  s.add("Swift");
  s.add("verne");
  s.add("Audi");

  //removeFirst() method
  s.removeFirst();
  System.out.println(s);

//removeLast() method
  s.removeLast();
  System.out.println(s);

  //addFirst() method
  s.addFirst("BMW");
  System.out.println(s);

  //addLast() method
  s.addLast("Nano");
System.out.println(s); 

  //getFirst() method
  System.out.println( s.getFirst());

  //getLast() method 
  System.out.println(s.getLast());
    }

}