package com.pisoftJava.OOPs.EmployeeMngSys;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class EmployeeService {

    static Scanner scanner = new Scanner(System.in);

     static List<Employee> employees = new ArrayList<>();


     //Adding Employee to the list
     static void addEmployee() {

         int id = 0;
         String name;
         double salary;

//         try {
//             System.out.print("Please enter employee ID: ");
//             id = scanner.nextInt();
//         }catch (InvalidInput e){
//             System.out.println(e.getMessage());
//         }

         //Handling exception for ID
         while (true) {
             try {
                 System.out.print("Please enter employee ID: ");
                 id = scanner.nextInt();

                 if (id < 0){
                     throw new InvalidInput();
                 }

                 break;

             } catch (InputMismatchException e) {
                 System.out.println("Invalid input. Please enter a valid integer for employee ID.");
                 scanner.nextLine();
             }
             catch (InvalidInput e) {
                 System.out.println(e.getMessage());
                 scanner.nextLine();
             }
         }

         //Checking for valid name
         while (true) {
             System.out.print("Please enter employee name: ");
             scanner.nextLine();
             name = scanner.nextLine();

             if(!name.matches("[a-zA-Z]+")){
                 System.out.println("Please enter a valid name.");
             }else break;
         }


         //Handling Exception for salary
         while (true) {
             try {
                 System.out.print("Please enter employee salary: ");
                 salary = scanner.nextDouble();

                 if (salary < 0 || salary > 100000){
                     throw new InvalidSalaryException();
                 }
                 break;
             } catch (InputMismatchException e) {
                 System.out.println("Invalid input. Salary should be in number.");
                 scanner.nextLine();
             }
             catch (InvalidSalaryException e) {
                 System.out.println(e.getMessage());
                 scanner.nextLine();
             }
         }

//         System.out.print("Please enter employee name: ");
//         name = scanner.next();
//
//         System.out.print("Please enter employee salary: ");
//         salary = scanner.nextDouble();

         employees.add(new Employee(id,name,salary));
         System.out.println("Employee added successfully!");
         System.out.println("============================");
     }




     //finding employee by ID
     static void findEmployeeById() throws EmployeeNotFoundException {

//         System.out.print("Please enter employee ID: ");
         int id;
         while (true) {
             try {
                 System.out.print("Please enter employee ID: ");
                 id = scanner.nextInt();

                 if (id < 0){
                     throw new InvalidInput();
                 }

                 break;

             } catch (InputMismatchException e) {
                 System.out.println("Invalid input. Please enter a valid integer for employee ID.");
                 scanner.nextLine();
             }
             catch (InvalidInput e) {
                 System.out.println(e.getMessage());
                 scanner.nextLine();
             }
         }
        for(Employee emp : employees){
            if (emp.getId() == id ){
//                System.out.println("Employee found with ID: " + id);
//                System.out.println("Employee details: ");
//                System.out.println("Name: " + emp.getName());
//                System.out.println("Salary: " + emp.getSalary());
                emp.display();
                System.out.println("=========================");

//                return "Employee Found!\n"+"ID: "+emp.getId()+"\nName: " + emp.getName() + "\nSalary: " + emp.getSalary() + "\n============================";
            }
        }
         throw new EmployeeNotFoundException("For Id " + id + ", Employee not found in the list, Please enter valid ID!");

     }



     //Updating Employee by ID
//     static void updateEmployeeById() throws InputMismatchException{
//         System.out.print("Please enter the ID to Update data: ");
//         int id = scanner.nextInt();
//         for(Employee emp : employees){
//             if (emp.getId() == id){
////                 emp.setId(scanner.nextInt());
//                 System.out.println("Employee found! Please enter new data.");
//
//                 System.out.println("Enter Name: ");
//                 String name = scanner.nextLine();
//                 emp.setName(name);
//
//                 System.out.println("Enter Salary: ");
//                 double salary = scanner.nextDouble();
//                 emp.setSalary(salary);
//
//             }else System.out.println("Please enter a valid ID!");
//         }
//         throw new InputMismatchException();
//     }


    static void viewAllEmployees(){

        if(employees.isEmpty()){
            System.out.println("No Employees found! Please add employees.");
            return;
        }
        System.out.println("All Employees: ");

        for(Employee emp : employees){
            emp.display();
        }
        System.out.println("================================");
    }

    static void deleteEmployeeById() throws EmployeeNotFoundException{
        if(employees.isEmpty()){
            System.out.println("No Employees found! Please add employees.");
            return;

        }
        System.out.print("Please enter the ID to Delete data: ");
        int id = scanner.nextInt();
        for(Employee emp : employees){
            if (emp.getId() == id){
                employees.remove(emp);
                System.out.println("Employee deleted successfully!");
                return;
            }else {
                System.out.println("Please enter a valid ID!");
                throw new EmployeeNotFoundException("For Id " + id + ", Employee not found in the list, Please enter valid ID!");
            }
        }
    }

    static void clearList(){
        employees.clear();
        System.out.println("All Employees cleared successfully!");
    }

//    static void updateEmployeeById() throws RuntimeException{
//        System.out.println("Update Employee by ID");
//        System.out.println("======================");
//        System.out.println("Enter ID to update data: ");
//        int id = 0;
//        try {
//             id = scanner.nextInt();
//             scanner.nextLine();
//        }catch (InputMismatchException e){
//            System.out.println("Please enter a valid numerical value.");
//            scanner.nextLine();
//            return;
//        }
//        try {
//            for(Employee emp : employees){
//                if (emp.getId() == id){
//                    System.out.println("Enter new data: ");
//                    System.out.print("Enter Name: ");
//                    String name = scanner.nextLine();
//                    emp.setName(name);
//                    System.out.print("Enter Salary: ");
//                    double salary = scanner.nextDouble();
//                    emp.setSalary(salary);
//                    System.out.println("Employee updated successfully!");
//                    return;
//                }
//            }
//        } catch (InputMismatchException e){
//            System.out.println(e.getMessage());
//        } catch (RuntimeException e) {
//            throw new RuntimeException(e);
//        }

//        boolean found = false;
//        for (Employee emp : employees) {
//            if (emp.getId() == id) {
//                found = true;
//                System.out.println("Enter new data:");
//
//                System.out.print("Enter Name: ");
//                String name = scanner.nextLine();
//                emp.setName(name);
//
//                System.out.print("Enter Salary: ");
//                try {
//                    double salary = scanner.nextDouble();
//                    emp.setSalary(salary);
//                    scanner.nextLine(); // Consume leftover newline
//                } catch (InputMismatchException e) {
//                    System.out.println("Invalid salary input. Please enter a numeric value.");
//                    scanner.nextLine(); // Clear invalid input
//                    return; // Exit the method
//                }
//
//                System.out.println("Employee updated successfully!");
//                break;
//            }
//        }
//
//        if (!found) {
//            System.out.println("Employee with ID " + id + " not found.");
//        }
//    }
}
