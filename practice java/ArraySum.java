public class ArraySum {
    public static void main(String[] args){
        int[] myArray={21,23,1,23,2};
        int sum=0;
        for (int i = 0; i< myArray.length; i++) {
             sum += myArray[i];
        }
        System.out.println("The sum is:" + sum);
    }
}
