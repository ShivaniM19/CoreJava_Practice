public class StringPalli {
      //using String builder
    public static void main(String[]args){
        System.out.println(isPalli("raam".toLowerCase()));
        System.out.println(isPalli("123321".toLowerCase()));
    }
    static boolean isPalli(String string){
        String rev=new StringBuilder(string).reverse().toString();
        return string.equals(rev);
    }
}
