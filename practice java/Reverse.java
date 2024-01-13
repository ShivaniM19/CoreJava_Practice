public class Reverse {
    public static void main(String[] args){
        String orgstr="shivani";
        String revstr= " ";
        System.out.println("Original string: "+ orgstr);

        for (int i = 0; i < orgstr.length(); i++) {
            revstr= orgstr.charAt(i) + revstr;
        }
        System.out.println("reversed string:" + revstr);
    }
}
