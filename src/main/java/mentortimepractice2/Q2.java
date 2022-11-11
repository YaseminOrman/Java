package mentortimepractice2;

public class Q2 {
    public static void main(String[] args) {

        /*  Question 1

         *
         * *
         * * *
         * * * *
         * * * * *

         */

        int row = 5;            //row

        for (int i = 1; i <= row; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
//        1 2 3 4 5
//        1 2 3 4 5
//        1 2 3 4 5
//        1 2 3 4 5
//        1 2 3 4 5 */

        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j + " ");

            }
            System.out.println();
        }
    }
}
