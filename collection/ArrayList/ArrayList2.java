import java.util.ArrayList;
public class ArrayList2 {
    public static void main(String[] args){
        ArrayList<Integer> num= new ArrayList<Integer>();
        num.add(12);
        num.add(22);
        num.add(14);
        num.add(37);
        System.out.println(num);
        num.set(1,23);
        System.out.println(num);
        
        //get()
        System.out.println(num.get(1));
        //remove ()
        num.remove(0);
        System.out.println(num);

       // num.clear();
        //System.out.println(num);

        System.out.println(num.size());

        for(int i=0;i<num.size();i++){
            System.out.println(num.get(i));

            //using for each loop
            for(int a : num){
                System.out.println(a);
            }
        }
    }
}
