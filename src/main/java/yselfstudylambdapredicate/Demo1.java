package yselfstudylambdapredicate;

import java.util.function.Predicate;

public class Demo1 {
    public static void main(String[] args) {
      // Example 1
        Predicate<Integer> p = i->(i>10);
        System.out.println(p.test(20));
        System.out.println(p.test(5));

        //Example 2 check the length of given string is grater than 4 or not
        Predicate<String> pr = s->(s.length()>4 );
        System.out.println(pr.test("Welcome"));

        //Ex3 Print arrayu elements whose size is >4 from array
        String names[]={"David","Scott","Smith","John","Mary"};
        for(String w:names){
            if(pr.test(w)){
                System.out.println(w);
            }
        }



    }
}
