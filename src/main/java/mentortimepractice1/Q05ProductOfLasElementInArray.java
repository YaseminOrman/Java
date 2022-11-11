package mentortimepractice1;

public class Q05ProductOfLasElementInArray {
    public static void main(String[] args) {
        // 2) Find the product of the last elements in the array elements of the
        //  given multi dimensional array { {1,2,3}, {4,5}, {6} }

        int arr[][] = {{1, 2, 3}, {4, 5}, {6}};

        int product = 1;
        for (int[] w : arr) {
            product = product * w[w.length - 1];
        }
        System.out.println(product);

        int brr[][] ={{2,4,6},{5,4},{8,10}};
        int product1=1;
        for(int[] w:brr){
            product1=product1*w[w.length-1];
        }
        System.out.println(product1);





    }
}