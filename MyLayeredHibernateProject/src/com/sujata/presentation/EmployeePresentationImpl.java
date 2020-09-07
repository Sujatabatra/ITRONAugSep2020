package com.sujata.presentation;

import com.sujata.bean.EmployeeEntity;
import com.sujata.helper.EmployeeHelper;
import com.sujata.service.EmployeeService;
import com.sujata.service.EmployeeServiceImpl;

import java.util.List;
import java.util.Scanner;

public class EmployeePresentationImpl implements EmployeePresentation {
    private EmployeeService employeeService=new EmployeeServiceImpl();
    @Override
    public void showMenu() {
        System.out.println("1. Search Employee");
        System.out.println("2. Add New Employee");
        System.out.println("3. Delete Employee ");
        System.out.println("4. Update Employee Designation");
        System.out.println("5. Display All Employees");
        System.out.println("6. Search Employee for Name and Department");
        System.out.println("7. Delete Employee By Name");
        System.out.println("8. Exit");
    }

    @Override
    public void performMenu(int choice) {
        Scanner sc=new Scanner(System.in);
        int id=0;
        switch (choice){
            case 1:
                System.out.println("Enter Employee id : ");
                id=sc.nextInt();
                EmployeeEntity employeeEntity=employeeService.getEmployee(id);
                if(employeeEntity!=null)
                    System.out.println(employeeEntity);
                else
                    System.out.println("Employee does not exist with id : "+id);
                break;
            case 2:
                EmployeeEntity employeeEntity1= EmployeeHelper.inputEmployee();
                if(employeeService.addEmployee(employeeEntity1))
                    System.out.println("Employee added");
                else
                    System.out.println("Employee not added");
                break;
            case 3:
                System.out.println("Enter Employee id : ");
                id=sc.nextInt();
                if(employeeService.deleteEmployee(id))
                    System.out.println("Employee Deleted");
                else
                    System.out.println("Employee not Deleted");
                break;
            case 4:
                System.out.println("Enter Employee id : ");
                id=sc.nextInt();
                System.out.println("Enter new Designation : ");
                String desig=sc.next();
                if(employeeService.updateEmployeeDesignation(id,desig))
                    System.out.println("Employee updated");
                else
                    System.out.println("Employee not Updated");
                break;
            case 5:
                List<EmployeeEntity> employees=employeeService.getAllRecords();
                for (EmployeeEntity employee:employees){
                    System.out.println(employee);
                }
                break;
            case 6:
                System.out.println("Enter Employee id : ");
                id=sc.nextInt();
                List<Object[]> details=employeeService.getNameDepartment(id);
                for(Object[] detail:details){
                    for(Object value:detail){
                        System.out.print(value+" - ");
                    }
                }
                break;
            case 7:
                System.out.println("Enter name : ");
                String name=sc.next();
                if(employeeService.deleteEmployeeByName(name))
                    System.out.println("Employee Deleted ");
                else
                    System.out.println("Employee not deleted");
                break;
            case 8:
                System.out.println("Good Bye!");
                System.exit(0);
            default :
                System.out.println("Invalid Choice");


        }
    }
}
