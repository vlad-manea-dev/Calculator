import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean calculate = true;
        while (calculate) {
            System.out.println("What is your first number: ");
            double firstNumber = sc.nextDouble();
            System.out.println("What is your second number: ");
            double secondNumber = sc.nextDouble();
            System.out.println("What operand would you like to use: ");
            double operand = sc.nextDouble();

            double sumResult = firstNumber + secondNumber;
            System.out.println("Sum: " + sumResult);

            double product = firstNumber * secondNumber;
            System.out.println("Product: " + product);

            double division = firstNumber / secondNumber;
            System.out.println("Division: " + division);

            double subtraction = firstNumber - secondNumber;
            System.out.println("Subtraction: " + subtraction);

            System.out.println("Would you like to continue: ");
        }
        boolean stopCalculating = false;
        if (stopCalculating) {
            System.out.println("Finished calculating session");
        }

        sc.close();
    }
}
