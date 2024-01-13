import java.util.Scanner;
public class Input2{
    public static void main(String[] args){
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter value of a");
        int a= obj.nextInt();
        obj.close();
        System.out.println(a);
    }
}