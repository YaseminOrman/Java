package mentortimepractice1;

public class Q06 {
    public static void main(String[] args) {
        //3) Find the sum of the elements whose indexes are same in the given two multi dimensional arrays
         //       arr1 = { {1,2}, {3,4,5}, {6} } and arr2 = { {7,8,9}, {10,11}, {12} }

        int arr1[][] = { {1,2}, {3,4,5}, {6} } ;
        int arr2[][] = { {7,8,9}, {10,11}, {12} };
        int sum = 0;
        for(int i=0; i<arr1.length; i++) {
            int minLength= Math.min(arr1[i].length, arr2[i].length);
            for(int j=0; j<minLength; j++) {

                sum+= arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println(sum);

       // Find the sum of the elements whose indexes are same in the given two multidimensional arrays
        int brr1[][] = { {1,2}, {3,4,5}, {6} } ;
        int brr2[][] = { {7,8,9}, {10,11}, {12} };

        int sum1=0;
        for(int i =0;i<brr1.length;i++){
            int minLen=Math.min(brr1[i].length,brr2[i].length);
            for(int k=0;k<minLen;k++){
                sum1=sum1+brr1[i][k]+brr2[i][k];
            }
        }
        System.out.println(sum1);





    }
}
