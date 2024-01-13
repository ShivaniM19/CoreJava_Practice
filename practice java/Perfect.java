public class Perfect {
    public static void main(String[] args){
        int n=24, sum=0;
        for(int i=1;i<n;i++){
            if(n%i == 0){
            sum=sum+i;        
            }   
        }
        System.out.println(sum);
        if(sum==n){
            System.out.println(n+ " is a perfect number");
        }
        else{
            System.out.println(n + " is a not perfect number");
        }
    }
}
