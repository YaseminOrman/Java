package day13arrays;

import java.util.Arrays;

public class Array01Review {
    public static void main(String[] args) {

        //how to create an array

        String myArray[]=new String[4];
        System.out.println(Arrays.toString(myArray));
        myArray[1]="selim";
        myArray[2]="Lily";
        myArray[0]="Ali";
        myArray[3]="Tom";
        System.out.println(Arrays.toString(myArray));

        System.out.println(myArray[2]);

        //Example 1 : Create an integer array and print the sum of the first and
        // the last elements on the console

        int numbers[] = new int[4];
        numbers[0]=5;
        numbers[1]=10;
        numbers[2]=15;
        numbers[3]=20;

        System.out.println(numbers[0] + numbers[numbers.length-1]);

        //Example 2: Create a double array and find the sum of all elements in the array
        //           [1.2, 2.3, 5.0, 4.51] ==> 13.01

        double prices[]=new double[4];
        prices[0]=1.2;
        prices[1]=2.3;
        prices[2]=5.0;
        prices[3]=4.51;

        //1.way
        double  sum =0;

        for(int i =0 ;i<prices.length;i++){
           sum = sum+ prices[i] ;
        }
        System.out.println(sum);


        //2.way
        double sum2=0;
        for(double w :prices ){
            sum2=sum2+w;
        }
      String firstElement=myArray[0];
      int idxOfLastElement =myArray.length-1;
      String lastElement=myArray[idxOfLastElement];
        System.out.println(firstElement+ " " +lastElement);

        //Example find the sum of all elements in an array [41,11,31,21,1]
        int myArray2[]={41,11,31,21,1};
        int sum3 = 0;
        for(int i=0 ; i<myArray2.length ;i++){
            sum3 = sum3+myArray2[i];
        }
        System.out.println(sum3);

        //2.way do while
        int myArray3[]={41,11,31,21,1};
        int sum4 = 0;
        int k =0;
        while(k<myArray3.length){
            sum4 = sum4+myArray2[k];
           k++;
        } System.out.println(sum4);

        //3.way for-each loop

        int myArray4[]={41,11,31,21,1};
        int sum5 = 0;
        for(int w : myArray4){
           sum5 =sum5+w;
        }
        System.out.println(sum5);










    }
}
