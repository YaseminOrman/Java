package day15multidimensionalarraylist;

public class MultiDimensionalArrays04Review {
    public static void main(String[] args) {

        //Example 1: Find the maximum element in a two-dimensional array
        //           { {5, 0}, {-2, 4}, {65, -12, 23} }

        int arr[][]={ {5, 0}, {-2, 4}, {65, -12, 23} };

        int max=arr[0][0];
        for(int[] w : arr){
            for(int u : w){
                if(max<u){
                    max=u;
                }
               //2.way: max=Math.max(max,u);
            }
        }
        System.out.println(max);






    }
}
