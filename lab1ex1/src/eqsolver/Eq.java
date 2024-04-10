package eqsolver;

public class Eq {
    private EqParameters parameters;
    private int errorCode; 
    private String errorMessage;

    public Eq(EqParameters parameters) {
        this.parameters = parameters;
    }

    public Solution solve() {
        double discriminant = parameters.getB() * parameters.getB();
        Solution solution = new Solution();
        if (discriminant < 0) {
            errorCode = 1;
            errorMessage = "No real number solutions";
        } else if (parameters.getA() == 0) {
            errorCode = 2;
            errorMessage = "Division by zero error";
        } else {
            double root1 = (-parameters.getB() + Math.sqrt(discriminant)) / (2 * parameters.getA());
            double root2 = (-parameters.getB() - Math.sqrt(discriminant)) / (2 * parameters.getA());
            solution.setSolutions(root1, root2);
        }
        return solution;
    }
}