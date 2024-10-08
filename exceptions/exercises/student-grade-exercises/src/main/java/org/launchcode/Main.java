package org.launchcode;

import javax.naming.directory.InvalidSearchFilterException;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        for (String student : studentFiles.keySet()) {
            String fileName = studentFiles.get(student);
            try {
                int points = CheckFileExtension(fileName);
                System.out.println(student + " received " + points + " points.");
            } catch (InvalidFileNameException e) {
                System.out.println("Error for " + student + ": " + e.getMessage());
            }
        }
    }

    public static int Divide(int x, int y) {
        try {
            if (y == 0 || x == 0) {
                throw new ArithmeticException("Cannot device by zero. Please enter a valid divisor.");
            }
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return (Integer) x / y;
    }


    public static int CheckFileExtension(String fileName) throws InvalidFileNameException {
        if (fileName== null || fileName.isEmpty()) {
            throw new InvalidFileNameException("File name cannot be null or empty.");
        }

        if (fileName.endsWith(".java")) {
            return 1;
        } else {
            return 0;
        }
    }
        // Write code here!
    static class InvalidFileNameException extends Exception {
        public InvalidFileNameException(String message){
            super(message);
        }
        }
}