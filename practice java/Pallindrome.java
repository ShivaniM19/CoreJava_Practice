class Pallindrome{

    public static void main(String[]args){
     int org=3983,rev=0,rem;
     int n=org;
     
     
     while(org!=0){
     rem= org%10;
     rev=rev*10+rem;
     org/=10;
     }
     if(n==rev){
        System.out.println("Given number is a pallindrome");
     }
     else{
        System.out.println("Given number is not an pallindrome");
     }
    }
}