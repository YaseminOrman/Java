package yselfstudylambdafunctions;

import java.util.ArrayList;
import java.util.function.Function;

class Employee{
    String  ename;
    int salary;

    Employee(String ename,int salary){
        this.ename=ename;
        this.salary=salary;
    }
}
public class Demo2 {
    public static void main(String[] args) {

        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(new Employee("David", 50000));
        empList.add(new Employee("John", 30000));
        empList.add(new Employee("Mary", 20000));

    }
}
