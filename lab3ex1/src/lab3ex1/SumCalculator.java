package lab3ex1;

public class SumCalculator {

	
	public static void main(String[] args) {
        int num1, num2, sum;

        try {
            num1 = InputReader.readInteger();
            num2 = InputReader.readInteger();
            sum = num1 + num2;
            
            //optional
            
            //catch exc interf

            System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        } catch (NumberFormatException e) {
            System.err.println("Error: Invalid input detected.");
        }
    }
}
