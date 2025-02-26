package com.pisoftJava.OOPs.EmployeeMngSys;

import java.util.InputMismatchException;

public class InvalidInput extends Throwable {
    public InvalidInput(){
        super("Invalid Input.........");
    }
    public static void throwException() throws InvalidInput{
        throw new InvalidInput();
    }
}
