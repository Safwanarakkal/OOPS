import Arithmetic.*;
import java.util.Scanner;

public class TestArithmetic {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        Add add = new Add();
        Subtract sub = new Subtract();
        Multiply mul = new Multiply();
        Divide div = new Divide();

        System.out.println("Addition: " + add.add(a, b));
        System.out.println("Subtraction: " + sub.sub(a, b));
        System.out.println("Multiplication: " + mul.mul(a, b));
        System.out.println("Division: " + div.div(a, b));
    }
}
