package com.pisoftJava.OOPs.EmployeeMngSys;

import java.util.InputMismatchException;

import static com.pisoftJava.OOPs.EmployeeMngSys.EmployeeService.*;

public class Main {
    public static void main(String[] args){

        System.out.println("Enter 1 to add employee");
        System.out.println("Enter 2 to find employee by ID");
        System.out.println("Enter 3 to exit");
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

                    if (option < 1 || option > 5) {
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
                        case 4:
                            viewAllEmployees();
                            break;
                        case 5:
                            try {
                                deleteEmployeeById();
                            }catch (EmployeeNotFoundException e){
                                System.out.println(e.getMessage());
                            }
                        case 3:
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
