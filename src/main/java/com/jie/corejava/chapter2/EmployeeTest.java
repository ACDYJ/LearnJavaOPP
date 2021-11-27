package com.jie.corejava.chapter2;

import java.util.HashMap;

public class EmployeeTest {



    public static void main(String[] args) {
        Employee [] staff=new Employee[3];
        staff[0]=new Employee("a",75000,1987,12,15);
        staff[1]=new Employee("B",5000,1987,12,15);
        staff[2]=new Employee("c",175000,1987,12,15);

        for(Employee employee:staff){
            employee.raiseSalary(5);
        }

        for(Employee employee:staff){
            System.out.println(employee.getSalary());
        }
    }
}
