import java.util.ArrayList;
class ArrayList1{
    public static void main(String[] args){
        ArrayList<String> cars= new ArrayList<String>();
        //add() method to add items;
        cars.add("Valvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("opel");
        cars.add("Audi");

        //set() method to modify element
        cars.set(1,"Swift");
        cars.set(0,"yamha");
        System.out.println(cars);

        //get() method to access an item
       System.out.println( cars.get(0));
       System.out.println(cars.get(2));

       //remove method to an element
       cars.remove(3); 
       cars.remove(2);
       System.out.println(cars);

       //to delete all element in ArrayList
       //cars.clear(); 
       System.out.println(cars.size());

       //for loop
       for(int i=0;i<cars.size();i++){
        System.out.println(cars.get(i));
       }
    }
}