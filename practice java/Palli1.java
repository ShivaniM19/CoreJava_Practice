public class Palli1 {
    //using for loop and charAt
    public static void main(String[]args){
        System.out.println(isPalli("ranam".toLowerCase()));
    System.out.println(isPalli("ranar".toLowerCase()));
}
    static boolean isPalli(String original){
      String rev ="";
      int len=original.length();
      for(int i=len-1;i>=0;i--){
        rev=rev+original.charAt(i);
      }
      return original.equals(rev);
    
    }
}
