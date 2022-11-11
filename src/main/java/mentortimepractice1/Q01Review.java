package mentortimepractice1;

public class Q01Review {
    public static void main(String[] args) {
        // 4) Create an array whose length is 4 and print the second element on the console.
        int arr[]={4, 5, 7, 9};
        System.out.println(arr[1]);

        // 6) Type a code to print all elements
        // in reverse order by putting "*" before each of them on the same line
        int brr[]={5,8,6,7};
        for(int i =brr.length-1;i>-1;i--){
            System.out.print("*"+brr[i]);

        }
        // 7)  HOMEWORK : Type code to print the elements whose indexes are even numbers.
        int crr[]={2,4,6,7,9,10};
        for(int i =0; i<crr.length;i++){
            if(i%2==0){
                System.out.print(crr[i]);
            }

        }

    }
}
