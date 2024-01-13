public class Math {
    public static void main(String args[]){
    //java Array
    String[] cars={"volvo","BMW","Ford","Mazda"};
    System.out.println(cars[0]);
      for(int i=0;i<cars.length;i++){
        System.out.println(cars[i]);
       }
     int[] myn={12,21,23};
     System.out.println(myn[0]);
     int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
     System.out.println(myNumbers[1][2]); 

    int[][] myNumber = { {1, 2, 3, 4}, {5, 6, 7} };
    for (int i = 0; i < myNumber.length; ++i) {
      for(int j = 0; j < myNumber[i].length; ++j) {
        System.out.println(myNumber[i][j]);
      }
    }
}
}
