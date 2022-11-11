package javaslideforloop;

public class DoWhileLoopQ1234 {
    public static void main(String[] args) {

        //1) Write a program to print numbers from 1 to 5 on the console by using do-while loop.
        int i = 1;
        do{
            System.out.print(i +" ");
            i++;
        }while(i<6);
        System.out.println();
        //2) Write a program to print numbers from 10 to 3 on the console by using do-while loop.

        int k= 10;
        do{
            System.out.print(k +" ");
            k--;
        }while(k>2);

        System.out.println();
        //3) Write a program to print numbers which are divisible by 5 between 1 and 100 on the console
        // by using do-while loop.
        int j = 1;
        do{
            if(j%5==0){
                System.out.print(j +" ");
            }
            j++;

        }while(j<101);
        System.out.println();
        //4) Write a program to print letters from c to m on the console by using do-while loop.
        char c = 'c';
        do{
            System.out.print(c+" ");
            c++;
        }while(c<='m');
    }
}
