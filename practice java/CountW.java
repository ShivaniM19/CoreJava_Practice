public class CountW {
    public static void main(String[] args){
        String words = "ad sfd fbj fdbjf gjdbg";
        int count = words.split("\\s").length;
        System.out.println(count);
    }
}
