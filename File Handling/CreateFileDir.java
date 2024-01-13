import java.io.File;
import java.io.IOException;
public class CreateFileDir{
    public static void main(String args[]){
        File obj=new File("D:\\vs code\\java\\File Handling\\filename.txt");
        try{
        if (obj.createNewFile()){
            System.out.println("File created:"+ obj.getName());
            System.out.println("Absolute path:"+obj.getAbsolutePath());

        }
        else{
            System.out.println("File already existed");

        }
    }
    catch (IOException e) {
        System.out.println("An error occured");
        e.printStackTrace();
    }

    }
}