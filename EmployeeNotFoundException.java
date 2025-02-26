package com.pisoftJava.OOPs.EmployeeMngSys;

public class EmployeeNotFoundException extends Throwable{
    public EmployeeNotFoundException(String msg){
        super(msg);
    }

//    public void EmpNotFound(String msg) throws EmployeeNotFoundException{
//        System.out.println(msg);
//    }
}
