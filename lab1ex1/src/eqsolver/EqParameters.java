package eqsolver;

public class EqParameters {
    private double a; 
    private double b;

    public EqParameters(double b) {
        this.a = 1; 
        this.b = b;
    }


    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
}