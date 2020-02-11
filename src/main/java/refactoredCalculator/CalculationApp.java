package refactoredCalculator;

import refactoredCalculator.CalculationPrompt.Prompter;
import refactoredCalculator.execution.Calculator;
import refactoredCalculator.execution.Validator;
import refactoredCalculator.execution.Values;
import refactoredCalculator.read.ConsoleInputReader;
import refactoredCalculator.read.Reader;

import java.util.Scanner;

public class CalculationApp {

//    public static boolean parseExpression(String input) {
//        //Trim the String from trailing whitespaces for comparisons
//        input = input.trim();
//        //Check if the entered string was quit regardless of the case to end the program
//        if (input.equalsIgnoreCase("quit")) {
//            return false;
//        } else {
//            try {
//                //Split the String to a String array using whitespace separation
//                String[] expression = input.split(" ");
//                //If the String is not quit and its containing one word then it is an invalid math function
//                if (expression.length < 2) {
//                    System.out.println("Invalid Input");
//                } else if (expression.length == 3) { //If its containing 3 words then its an arithmetic function
//                    //Operand 1
//                    double op1 = Double.parseDouble(expression[0]);
//                    //Arithmetic operation
//                    char operation = expression[1].charAt(0);
//                    //Operand 2
//                    double op2 = Double.parseDouble(expression[2]);
//                    switch (operation) {
//                        case '+':
//                            System.out.printf("%.2f\n", op1 + op2);
//                            break;
//                        case '-':
//                            System.out.printf("%.2f\n", op1 - op2);
//                            break;
//                        case '*':
//                            System.out.printf("%.2f\n", op1 * op2);
//                            break;
//                        case '/':
//                            System.out.printf("%.2f\n", op1 / op2);
//                            break;
//                        default:
//                            System.out.println("Invalid Input");
//                            break;
//                    }
//                }
//            } catch (Exception e) {
//                System.out.println("Invalid Input");
//            }
//            return true;
//        }
//    }


    public static void main(String[] args) {
        //Continuously prompt for input
        ConsoleInputReader reader = new ConsoleInputReader();
        Values values = new Values();
        Validator validator = new Validator(reader, values);
        Calculator calculator = new Calculator();
        Prompter prompter = new Prompter(reader, validator, calculator, values);
        prompter.executePrompter();
        //Free all resources used by Scanner class
        System.out.println("GoodBye!");
    }
}
