package com.pisoftJava.OOPs.EmployeeMngSys;

public class InvalidSalaryException extends Throwable {
    public InvalidSalaryException() {
        super("Please enter a valid salary. It should be greater than 0 and less than 100000!");
    }
//            throw new InvalidSalaryException();

//    public void InvalidSalary(double salary) throws InvalidSalaryException {
//        if (salary < 0 || salary > 100000) {
//            System.out.println("Please enter a valid salary!");
//            throw new InvalidSalaryException();
//        }
//    }
//    }
}
