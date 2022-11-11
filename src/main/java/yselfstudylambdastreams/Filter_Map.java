package yselfstudylambdastreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    int empid;
    String empname;
    int salary;
    Employee(int empid,String empname,int salary){
        this.empid=empid;
        this.empname=empname;
        this.salary=salary;
    }
}
public class Filter_Map {
    public static void main(String[] args) {

        List<Employee> employeesList= new ArrayList<>();
        employeesList.add(new Employee(101,"Alex",10000));
        employeesList.add(new Employee(102,"Brian",20000));
        employeesList.add(new Employee(103,"Charles",30000));
        employeesList.add(new Employee(104,"David",40000));
        employeesList.add(new Employee(105,"Edward",50000));

        List<Integer> salList=  employeesList.stream().filter(e->e.salary>20000).map(e->e.salary).collect(Collectors.toList());
        System.out.println(salList);

        List<Object > nameList=employeesList.stream().filter(e->e.empname.length()>5).map(e->e.empname).collect(Collectors.toList());
        System.out.println(nameList);



    }

}
