public class Array {
    public static void main(String[] args){
        int[] myArr = {12,3,24,43,23};
        int sum =0;
        for(int i=0;i<myArr.length;i++){
            sum += myArr[i];
           
        }
        System.out.println("sum is :"+ sum);
    }
}
