import java.io.File;
import java.io.IOException;
public class CreateFile {
    public static void main(String args[]){
        try {
            File myobj= new File("file1.txt");
            if(myobj.createNewFile()){
                System.out.println("File created is:" + myobj.getName());
            }
            else{
                System.out.println("File already existed");
            }
        } catch (Exception e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
}
