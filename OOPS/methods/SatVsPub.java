public class SatVsPub {
    //staic method vs public method

    static void sam(){
        System.out.println("sdbfj fdfbj fnjgdf");

    }
    public void dam(){
        System.out.println("vbdf dfdgdf djgbf");

    }

    public static void main(String[] args){
        sam();
        SatVsPub s1= new SatVsPub();
        s1.dam();
    }
}
