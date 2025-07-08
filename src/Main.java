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
      String operand = sc.next();

//      if (operand.equals("+")) {
//        double sum = firstNumber + secondNumber;
//        System.out.println("sum: " + sum);
//      } else if (operand.equals("-")) {
//        double subtraction = firstNumber - secondNumber;
//        System.out.println("subtraction: " + subtraction);
//      } else if (operand.equals("/")) {
//        double division = firstNumber / secondNumber;
//        System.out.println("division: " + division);
//      } else if (operand.equals("*")) {
//        double multiplication = firstNumber * secondNumber;
//        System.out.println("multiplication: " + multiplication);
//      }

      switch (operand) {
        case ("+"):
          double sum = firstNumber + secondNumber;
          System.out.println("sum: " + sum);
          break;
        case ("-"):
          double subtraction = firstNumber - secondNumber;
          System.out.println("subtraction: " + subtraction);
          break;
        default:
          double multiplication = firstNumber * secondNumber;
          System.out.println("multiplication: " + multiplication);
          break;
      }

      System.out.println("Would you like to continue (True or False): ");
      calculate = sc.nextBoolean();
    }

    sc.close();
  }
}
