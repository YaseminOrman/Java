package springpracticemultidimensionalaray;

import java.util.Arrays;

public class MultiDimensionalArray01 {
    public static void main(String[] args) {
        int mda1[][]=new int[3][2];

        System.out.println(Arrays.deepToString(mda1));

        mda1[0][0]=11;
        mda1[0][1]=9;
        mda1[1][0]=5;
        mda1[1][1]=4;
        mda1[2][0]=1;
        mda1[2][1]=21;
        System.out.println(Arrays.deepToString(mda1));

       int  mda2[][]={{2,3},{12},{21,34,56},{4}};
        System.out.println(Arrays.deepToString(mda2));

        System.out.println(Arrays.toString(mda2[2]));

        //how to find the number of elements on a multidimensional
        int sum=0;

        for(int[] w: mda2){
            sum=sum+w.length;

        }
        System.out.println(sum);
    }
}

