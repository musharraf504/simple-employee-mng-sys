package com.pisoftJava.OOPs.EmployeeMngSys;

import java.util.InputMismatchException;

import static com.pisoftJava.OOPs.EmployeeMngSys.EmployeeService.*;

public class Main {
    public static void main(String[] args){

        System.out.println("Enter 1 to add employee");
        System.out.println("Enter 2 to find employee by ID");
        System.out.println("Enter 3 to view all employees");
        System.out.println("Enter 4 to delete employee by ID");
        System.out.println("Enter 5 to update employee by ID !!(Currently not supported)!!");
        System.out.println("Enter 6 to clear all employees");
        System.out.println("Enter 7 to exit");

        System.out.println();
//        addEmployee();
//
//        System.out.println("below add");
//
//        try{
//            System.out.println(findEmployeeById());
//            System.out.println("below findById");
//
//        }catch (EmployeeNotFoundException e){
//            System.out.println(e.getMessage());
//        }
//
//        System.out.println("below all");
        try {
            boolean exit = true;
            while(exit) {

                try {

                    System.out.print("Enter your choice: ");

                    int option = scanner.nextInt();

                    if (option < 1 || option > 7) {
                        System.out.println("Invalid option!");
                        continue;
                    }

                    switch (option) {
                        case 1:
                            addEmployee();
                            break;
                        case 2:
                            try {
//                        System.out.println(findEmployeeById());
                                findEmployeeById();
                            } catch (EmployeeNotFoundException e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                        case 3:
                            viewAllEmployees();
                            break;
                        case 4:
                            try {
                                deleteEmployeeById();
                            }catch (EmployeeNotFoundException e){
                                System.out.println(e.getMessage());
                            }
                            break;
//                        case 5:
//                            try {
//                                updateEmployeeById();
//                            }catch (RuntimeException e){
//                                System.out.println(e.getMessage());
//                            }
                        case 6:
                            clearList();
                            break;
                        case 7:
                            exit = false;
                            break;

                    }
                }catch (InputMismatchException e){
                    System.out.println("Please enter a valid numerical value.");
                    scanner.nextLine();
                }

            }
            System.out.println("Successfully exited!");
        }catch (InputMismatchException e){
            System.out.println("Wrong input! Please enter a valid numerical value.");
//            System.out.println(e.getMessage());
        }
    }
}
