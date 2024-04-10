package lab5ex1;

import java.util.Scanner;

public class C2Nr {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter first number:");
	        double num1 = scanner.nextDouble();

	        System.out.println("Enter second number:");
	        double num2 = scanner.nextDouble();

	        double sum = num1 + num2;
	        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);

	        scanner.close();
	    }
	}

