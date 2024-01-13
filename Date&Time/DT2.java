import java.util.LocalDateTime;
import java.util.DateTimeFormatter;
public class DT2 {
        public static void main(String args[]){
        LocalDateTime dt=new LocslDateTime.now();
        System.out.println(dt);

        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd/MM/yyyy ");
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("yyyy-MM-dd ");
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd-MMM-yyyy ");
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("E,MMM dd yyyy ");

        String formattedDate= dt.format(dtf);
        System.out.println("After"+formattedDate);
    }
}


