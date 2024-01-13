import java.io.File;
public class DeleteFile{
    public static void main(String args[]){
        File obj=new File("file1.txt");
        if (obj.delete()) {
            System.out.println("File Deleted successfully:" + obj.getName());
            
        } else {
            System.out.println(" failed to delete the file");
        }
    }
}