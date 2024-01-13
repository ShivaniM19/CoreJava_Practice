import java.util.*;
public class Pattern2 {
    public static void main(String[] args) {
        int c=5;
        int r=4;
        for(int i=0;i<c;i++){
            for (int j = 0; j < r; j++) {
                if (i==0 || i==c-1 || j==0 || j==r-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
}
