package springpracticemultidimensionalaray;

public class MultiDimensionalArray02 {
    public static void main(String[] args) {
        //find the maximum value in the array

        int [][]a={{5,0}, {-5,34}, {65,22,31}};
        int x =Integer.MIN_VALUE;

        for(int[] w : a){
            for(int m : w){
                if(x<m){
                    x=m;
                }

            }
        }
        System.out.println(x);

    }
}
