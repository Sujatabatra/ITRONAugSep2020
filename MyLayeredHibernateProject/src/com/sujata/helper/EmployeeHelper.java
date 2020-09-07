package com.sujata.helper;

import com.sujata.bean.EmployeeEntity;

import java.util.Scanner;

public class EmployeeHelper {
    public static EmployeeEntity inputEmployee(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee Id : ");
        int id=sc.nextInt();
        System.out.println("Enter Employee Name : ");
        String name=sc.next();
        System.out.println("Enter Employee Designation : ");
        String des=sc.next();
        System.out.println("Enter Employee Department : ");
        String dep=sc.next();
        System.out.println("Enter Employee Salary : ");
        int sal=sc.nextInt();
        EmployeeEntity employeeEntity=new EmployeeEntity(id,dep,des,name,sal);
        return employeeEntity;
    }
}
