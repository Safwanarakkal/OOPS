package Arithmetic;

public class Divide implements DivI {
    public double div(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return (double)a / b;
    }
}
