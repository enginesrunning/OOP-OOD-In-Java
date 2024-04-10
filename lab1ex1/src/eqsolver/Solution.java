package eqsolver;

public class Solution {
    private double root1;
    private double root2;
    private int errorCode;
    private String errorMessage;

    public void setSolutions(double root1, double root2) {
        this.root1 = root1;
        this.root2 = root2;
    }

    public void show() {
        System.out.println("Root 1: " + root1);
        System.out.println("Root 2: " + root2);
    }

    public int getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}

//modul full