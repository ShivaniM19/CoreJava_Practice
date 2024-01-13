class planet{
   protected String PlaName="Sun1";
   public void alias(){
    System.out.println("Sun is also called bhaskar");
}
}
class Sun extends planet{
    private String name="Bhaskar";
   public static void main(String[] args){
   Sun s1= new Sun();
   s1.alias();
   System.out.println(s1.name);
    System.out.println("Sun is also called bhaskar");
}
    
}

