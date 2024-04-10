package eqsolver;
public class EquationSolver {
    public static void main(String[] args) {
        double b = 3; 

        double root1 = Math.sqrt(b * b);
        double root2 = -Math.sqrt(b * b);
        
        
        System.out.println("The roots of the equation x^2 - b^2 = 0 for b = " + b + " are:");
        System.out.println("Root 1: " + root1);
        System.out.println("Root 2: " + root2);
    }
}
