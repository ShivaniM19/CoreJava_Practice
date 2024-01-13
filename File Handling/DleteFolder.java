import java.io.File;

public class DleteFolder {
    public static void main(String args[]){
        File obj=new File("D:\\vs code\\java\\File Handling\\bhjh");
        if(obj.delete()){
            System.out.println("Folder Deleted successfully:" + obj.getName());
        }
        else{
            System.out.println("Failed to Delete the Folder " );
        }
    }
}
