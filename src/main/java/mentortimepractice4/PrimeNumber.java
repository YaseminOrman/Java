package mentortimepractice4;

public class PrimeNumber {
    public static void main(String[] args) {
//
//        int num =2;
//        boolean prime = true;
//
//        if(num<2){
//            System.out.println("Invalid Number");
//        }else {
//            for (int i = 2; i < num; i++) {
//                if (num % i == 0) {
//                    prime = false;
//                    break;
//                }
//            }
//            System.out.println(prime);
//
//        }

        int m=3;
        int counter=0;
        int sum=0;

        for(int i =1;i<m+1;i++){

        }
        if(counter==2){
            System.out.println("Prime");
        }else {
            System.out.println("Not Prime");


            do {
                sum = sum + m % 10;
                m = m / 10;

            } while (m!=0);
            System.out.println(sum);
        }
    }

}
