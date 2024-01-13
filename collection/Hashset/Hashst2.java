import java.util.HashSet;
public class Hashst2 {
    public static void main(String args[]){
    HashSet<String> st=new HashSet<String>();
    //add() method
    st.add("dfujs");
    st.add("rannn");
    st.add("kannn");
    st.add("panmmsd");
    System.out.println(st);

    //contains()method
    System.out.println(st.contains("fafff"));
    System.out.println(st.contains("kannn"));

    //size() method
    st.size();
    System.out.println(st.size());

    //remove() method
    st.remove("dfujs");
    System.out.println(st);

    //loop
    for(String i:st){
        System.out.println(i);
    }

     //clear() method
     st.clear();
     System.out.println(st);

    }
}
