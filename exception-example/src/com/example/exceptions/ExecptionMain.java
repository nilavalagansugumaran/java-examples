package com.example.exceptions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ExecptionMain {

    public static void main(String args[]) throws IOException {
        createFileAndHandleException1();
        try {
            createFileAndHandleException2();
        } catch (IOException ioe) {
            // do something
            // still not fine
            throw ioe; // rethrowing the exception
        }

        try {
            createFileAndHandleException3(null);
            createFileAndHandleException3("nila.txt");
        } catch (MyOwnException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    private static void createFileAndHandleException1() {

        PrintWriter out = null;

        try { // Something can possibly go wrong in the below lines of code
            out = new PrintWriter(new BufferedWriter(new FileWriter("myfile.txt")));

            out.println("Hello nila");
            out.println("End of file");

        } catch (IOException ioe) { // Only on specific conditions
            ioe.printStackTrace();
            System.out.println("File can not be created");
        } finally { // Always for clean-up, or graceful handling
            if (out != null) {
                out.close();
            }
        }
    }

    // I dont know how to handle the issue so handing it to someone else
    private static void createFileAndHandleException2() throws IOException {

        PrintWriter out = null;
        // Something can possibly go wrong in the below lines of code
        out = new PrintWriter(new BufferedWriter(new FileWriter("myotherfile.txt")));
        out.println("Hello nila");
        out.println("End of file");

        if (out != null) {
            out.close();
        }
    }

    // I dont know how to handle the issue so handing it to someone else
    private static void createFileAndHandleException3(String fileName)
            throws IOException, MyOwnException {

        if (fileName == null) {
            throw new MyOwnException("File name can not null");
        }
        PrintWriter out = null;
        // Something can possibly go wrong in the below lines of code
        out = new PrintWriter(new BufferedWriter(new FileWriter(fileName)));
        out.println("Hello nila");
        out.println("End of file");

        if (out != null) {
            out.close();
        }
    }
}

class MyOwnException extends Exception {

    public MyOwnException(String message) {
        super(message);
    }
}
