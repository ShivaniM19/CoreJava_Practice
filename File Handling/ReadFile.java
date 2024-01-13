import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String args[]){
        try {
            File obj=new File("filename.txt");
            Scanner myReader=new Scanner(obj);
           
            while(myReader.hasNextLine()){
                String data=myReader.nextLine();
                System.out.println(data);
                
            }
            myReader.close();
        } catch (Exception e) {
            System.out.println("An error occored");
            e.printStackTrace();
        }
        
    }
}
