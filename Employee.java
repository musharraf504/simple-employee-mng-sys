package com.pisoftJava.OOPs.EmployeeMngSys;

public class Employee {
    final int id;
    String name;
    double salary;



    Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

//    Employee(String name, double salary){
//        this.name = name;
//        this.salary = salary;
//    }

    public void display(){
        System.out.println("ID:" + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }




    //Getter nd Setter

    public int getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
