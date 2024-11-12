package calculate;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       // Create object from calculator class
        Calculator calculator = new Calculator();
       char continueCalculation;
        // call scanner
        do {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter first number");
            int firstnumber = scanner.nextInt();
            System.out.println("Please enter second number");
            int secondnumber = scanner.nextInt();
            System.out.println("Please enter a symbol");
            char symbol = scanner.next().charAt(0);
// perform calculation based on symbol
            calculator.calculateResult(firstnumber, secondnumber, symbol);

            // Ask if user wants to do another calculation
            System.out.println("Would you like to do more calculations? Please enter 'Y' or 'N':");
            continueCalculation = scanner.next().charAt(0);

        }while(continueCalculation == 'Y');

        System.out.println("Thankyou for using Calculator");


    }
}
