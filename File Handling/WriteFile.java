import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String args[]) {
        try {
            FileWriter myWriter =new FileWriter("filename.txt");
            myWriter.write("Files in the java might be tricky wsgydeyiferyu ijfoooooooor irourjinjdgkjg. dfhdgty gyhyh cfgujh");
            myWriter.close();
            System.out.println("Successfully wrote in the file");
        } catch (Exception e) {
            System.out.println("An Error occured");
            e.printStackTrace();
        }
    }
}
