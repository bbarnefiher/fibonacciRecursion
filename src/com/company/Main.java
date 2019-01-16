package com.company;
import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	Scanner intReader = new Scanner(System.in);
        System.out.println("Please enter a number to figure out of it is a fibonacci number or not.");
        int userInput = intReader.nextInt();
        System.out.println(userInput + " is a fibonacci number. Here are the numbers leading up to it: ");


            int i = 0;

            while(true){
                i++;

                    System.out.print (Fibonacci.Fibonacci(i) + " ");
                if (i > 30) {


                    if (userInput != Fibonacci.Fibonacci(i)) {
                        System.out.println("\nActually never mind " + userInput + " is not a fibonacci number xd");
                        System.exit(0);
                    }
                }


                if (Fibonacci.Fibonacci(i) == userInput){
                    break;
                }
            }
       }
}
