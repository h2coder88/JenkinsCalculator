import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Welcome to JenkinsCalculator.  Enter a command to begin calculating!");

        while(true) {

            String line = scanner.nextLine();
            String[] tokens = line.split(" ");

            if (tokens[0].equals("quit")) {
                return;
            }
            else if (tokens[0].equals("add")) {
                int result = calculator.add(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
                System.out.println(result);
            }
            else if (tokens[0].equals("subtract")) {
                int result = calculator.subtract(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
                System.out.println(result);
            }
            else if (tokens[0].equals("multiply")) {
                int result = calculator.multiply(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
                System.out.println(result);
            }
            else if (tokens[0].equals("divide")) {
                int result = calculator.divide(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
                System.out.println(result);
            }
            else if (tokens[0].equals("fib")) {
                int result = calculator.fibonacciNumberFinder(Integer.parseInt(tokens[1]));
                System.out.println(result);
            }
            else if (tokens[0].equals("binary")) {
                String result = calculator.intToBinaryNumber(Integer.parseInt(tokens[1]));
                System.out.println(result);
            }
        }

    }
}
