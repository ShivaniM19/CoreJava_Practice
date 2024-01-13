import java.util.ArrayList;
import java.util.Collections;

//sorting using Collections.sort() method
public class ArrayList3 {
    public static void main(String[] args){
        ArrayList<String> str= new ArrayList<String>();
        ArrayList<Integer> num= new ArrayList<Integer>();
        str.add("asdsj");
        str.add("ncvkfg");
        str.add("vjdf");
        str.add("aaodu");
        str.add("ljhfd");

        num.add(12);
        num.add(43);
        num.add(2);
        num.add(24);
        Collections.sort(str);
        for(String i: str){
            System.out.println(i);
        }

        Collections.sort(num);
        for(int a : num){
            System.out.println(a);
        }
    }
}
 