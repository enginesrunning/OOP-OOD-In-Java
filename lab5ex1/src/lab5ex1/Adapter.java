package lab5ex1;

public class Adapter {
    public static double sumOfTwoUsingThree(double num1, double num2) {
        double num3 = 0;
        return sumOfThree(num1, num2, num3);
    }

    public static double sumOfThree(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }
}
