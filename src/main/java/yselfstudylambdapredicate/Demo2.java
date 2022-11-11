package yselfstudylambdapredicate;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
    String ename;
    int salary;
    int experience;

    Employee(String name,int sal,int exp){
        ename=name;
        salary=sal;
        experience=exp;
    }

    }

public class Demo2 {
    public static void main(String[] args) {
       //emp obj --->  return name is sal>30K  exp>3
        Employee emp = new Employee("John",50000,5);

        Predicate<Employee> pr = e-> (e.salary>30000 && e.experience>3);

        System.out.println(pr.test(emp));

        //Ex2
        ArrayList<Employee> al = new ArrayList<Employee>();
        al.add(new Employee("John",50000,5));
        al.add(new Employee("David",20000,2));
        al.add(new Employee("Scott",30000,3));
        al.add(new Employee("Mary",40000,6));

        for(Employee w : al){
            if(pr.test(w)){
                System.out.println(w.ename+ " "+w.salary);
            }
        }

    }
}
