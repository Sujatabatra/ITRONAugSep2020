package com.sujata.client;

import com.sujata.presentation.EmployeePresentation;
import com.sujata.presentation.EmployeePresentationImpl;

import java.util.Scanner;

public class MyClient {
    public static void main(String[] args) {
        EmployeePresentation employeePresentation=new EmployeePresentationImpl();
        Scanner sc=new Scanner(System.in);
        while(true){
            employeePresentation.showMenu();
            System.out.println("Enter Choice : ");
            int choice=sc.nextInt();
            employeePresentation.performMenu(choice);
        }
    }
}
