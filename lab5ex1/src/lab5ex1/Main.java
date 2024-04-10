package lab5ex1;

import java.util.Scanner;

/*
 * Proiectați o clasă C2Nr care să permită calculul sumei a două numere și o clasă
C3Nr care să permită calculul sumei a trei numere. Scrieți o clasă de tip Adapter care sa poate calcula
suma a doua numere folosind suma a 3 numere. 8
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();
        double sum = Adapter.sumOfTwoUsingThree(num1, num2);
        System.out.println("Sum of " + num1 + " and " + num2 + " using sumOfThree is: " + sum);

        scanner.close();
    }
}
//n
