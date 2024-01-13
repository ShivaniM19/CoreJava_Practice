public class Para {
    static void myMethod(String fname){
        System.out.println(fname + "marks");
    }
    static void myM(String fname, int age) {
        System.out.println(fname + " is " + age);
      }
    
    public static void main(String[] args) {
        myMethod( "joahn");
        myMethod( "joy");
        myMethod( "ram");
        myM("Liam", 5);
    myM("Jenny", 8);
    myM("Anja", 31);
    }
}
