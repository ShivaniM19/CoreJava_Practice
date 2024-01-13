import java.util.Scanner;
public class Scan1 {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        float b=scan.nextFloat();
        scan.nextLine();
        String s=scan.nextLine();
        scan.close();
        System.out.println("Given numbers are:"+ a +" "+ b+ " "+ s);
    }
}
