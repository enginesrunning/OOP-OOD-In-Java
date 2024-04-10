package main;

import eqsolver.Eq;
import eqsolver.EqParameters;
import eqsolver.Solution;

public class EqSolver {

    public static void main(String[] args) {
        EqParameters equationParameters = new EqParameters(2); 

        Eq equation = new Eq(equationParameters); 
        Solution solution = equation.solve();

        if (solution.getErrorCode() == 0) {
            solution.show();
        } else {
            System.out.println("Error: " + solution.getErrorMessage());
        }
    }
}