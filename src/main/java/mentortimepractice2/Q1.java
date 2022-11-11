package mentortimepractice2;

public class Q1 {
    public static void main(String[] args) {
        //Question1-
//
//        int x=10;
//        System.out.println(x++);
//        System.out.println(++x);
//        System.out.println(x--);
//        System.out.println(--x);

        //Question2- Print final value of num1, num2, num3, num4


//        int num1 = 10;
//        int num2 = num1 + 1;
//
//        num2 += 5;
//        int num3 =  num2++;
//        int num4 = ++num1;

        int x =5 ;

        System.out.println(x>2 ? x <9 ? x <6 ? x >10 ? 10 : -2 :  8 : 7  : 20);
        //Question1-
//        int x=10;                   // basilan      x       x++ = x=x+1;   x+=1
//        System.out.println(x++);  //   10           11
//        System.out.println(++x);    //  12          12
//        System.out.println(x--);    //12            11
//        System.out.println(--x);    //10            10

//pre  ve post increment


//        int x= 10;
//
//        int y=++x;     //y=11   x=11
//        int a=--x;     //a=10     x=10
//        int b= x++;    //b=10    x=11;
//        int c= x--;    //c=11      x=10;
//
//        System.out.println(a+b+c+y);


//------------------------------------------------------------------------------------


//Question2- Print final value of num1, num2, num3, num4


//        int num1 = 10;                      //num1=10;
//        int num2 = num1 + 1;   //num2=10+1=11
//
//        num2 += 5;              // num2= num2+5;  num2= 11+5=16
//        int num3 =  num2++;     //num3= 16   num2=17
//        int num4 = ++num1;      //num4=11       num1=11
//
//        System.out.println(num1);
//        System.out.println(num2);
//        System.out.println(num3);
//        System.out.println(num4);



//------------------------------------------------------------------------------------


//Question 3- Print final value of a, b in the console

//        int a = 15;
//        int b = ++a;            //b=16   a=16
//
//        b = --a;           // b=15   a=15
//
//        b = a++;            //b=15      a=16
//
//        b = a--;            //b=16  a=15
//
//        System.out.println("a:" + a + ", b:" + b );

//------------------------------------------------------------------------------------


//Question 4- Print final value of a, b, c, d in the console

//        int a = 5;
//        int b = 2;
//        int c;
//        int d;
//        c = ++b;        //c=3;  b=3
//        d = a++;        //d=5;  a=6
//        c++;        //c=4
//
//
//
//        System.out.println("a: "+a+"\nb: " + b + "\nc: " + c + "\nd: " + d);

//-------------------------------------------------------------------------------------------------


////Question 5- What is the output?

//   int num1=9;
//   int num2=num1++;
//
//   if(num2<10)    {
//       System.out.println(num2 + " Hello World");
//   } else {
//       System.out.println(num1 + "Hello Universel");
//   }



//-------------------------------------------------------------------------------------------------



//Question-6 : What is the final result of a, b, c, d?


//        int a = 5;
//        int b = 2;
//        int c;
//        int d;
//
//        c = ++b;            //c=3, b=3
//        d = a++;            //d=5, a=6
//        c++;                //c=4
//        b = --a;            //b=5,  a=5
//        a = --c;            //a=3, c=3
//        d = b--;            //d=5, b=4
//
//
//        System.out.println(a);      //3
//        System.out.println(b);      //4
//        System.out.println(c);      //3
//        System.out.println(d);      //5

//-------------------------------------------------------------------------------------------------


//Question 7, What is the sum of a+b+c+d

//        int a = 5;
//        int b = 2;
//        int c;
//        int d;
//        c = ++b;        //c=3, b=3
//        d = a++;        //d=5; a=6
//        c++;        //c=4
//        d = b--;        //d=3, b=2
//        b= a++;     //b=6,  a=7
//        c = --b+ (--a);     //c=5 + 6 =11    b=5   a=6
//
//
//        System.out.println(a+b+c+d);
//-------------------------------------------------------------------------------------------------


//Question 8- What is the result of num1+num2+num3+num4?


//        int num1 = 10;
//        int num2 = num1 + 1;        //num2=11
//
//        num2 += 5;          //num2=16
//        int num3 =  num2++;     //num3=16, num2=17
//        int num4 = ++num1;      //num4=11       num1=11
//
//        System.out.println(num1+num2+num3+num4);




//Question 9- What is the result?

//        int x =5 ;
//
//        System.out.println(x>2 ? (x <4 ? 10 : 8) : 7 );




////Question 10- What is the result?
//        int x =5 ;
//
//        System.out.println(x>2 ? x <9 ? x <6 ? x >10 ? 10 : -2 :  8 : 7  : 20);
//
//        // x <9 ? x <6 ? x >10 ? 10 : -2 :  8 : 7
//
//        //x <6 ? x >10 ? 10 : -2 :  8
//
//        //x >10 ? 10 : -2
     //   11:31
 /*  Question 1

1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5

  */
//
//        int row=5;            //row
//
//        for(int i=1; i<=row; i++) {
//
//            for(int j=1; j<=row; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
//        11:32
 /*  Question 1

1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5

  */

        int row=5;            //row

        for(int i=1; i<=row; i++) {

            for(int j=1; j<=row; j++) {
                System.out.print( "* ");
            }
            System.out.println();
        }
    }


}
