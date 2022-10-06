package com.codelanes.calculator;

import java.util.Scanner;

public class Calculator {
    public double addNumbers(double num1, double num2){
        return num1 + num2;
    } 

    public double subtractNumbers(double num1,double num2){
        return num1 - num2;
    }

    public double multiplyNumbers(double num1, double num2){
        return num1 * num2;
    }

    public double divideNumbers(double num1, double num2){
        return num1/num2;
    }

    public void showMenu(){
        char option;
        double num3, num4, num5, num6, num7, num8, num9, num10;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Choose Calculator Function");
            System.out.println(" A. Addition \n B. Subtraction \n C. Multiplication \n D. Division \n E. Exit");
            System.out.println("Enter option");
            option = scan.next().charAt(0);
        
            switch(option){
                case 'A':
                    System.out.println("Enter first number");
                    num3 =scan.nextDouble();
                    System.out.println("Enter second number");
                    num4 =scan.nextDouble();
                    System.out.println("The sum is " + addNumbers(num3,num4) + "\n");
                    break;

                case 'B':
                    System.out.println("Enter first number");
                    num5 =scan.nextDouble();
                    System.out.println("Enter second number");
                    num6 =scan.nextDouble();
                    System.out.println("The difference is " + subtractNumbers(num5,num6) + "\n");
                    break;

                case 'C':
                    System.out.println("Enter first number");
                    num7 =scan.nextDouble();
                    System.out.println("Enter second number");
                    num8 =scan.nextDouble();
                    System.out.println("The product is " + multiplyNumbers(num7,num8) + "\n");
                    break;

                case 'D':
                    System.out.println("Enter first number");
                    num9 =scan.nextDouble();
                    System.out.println("Enter second number");
                    num10 =scan.nextDouble();
                    System.out.println("The quotient is " + divideNumbers(num9,num10) + "\n");
                    break;

                case 'E':
                    System.out.println("----------");
                    break;

                default:
                    System.out.println("Invalid input");
                    break;

            }
    
        } while (option != 'E');
        scan.close();
    }
       
}
