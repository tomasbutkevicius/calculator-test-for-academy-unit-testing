package refactoredCalculator.CalculationPrompt;

import refactoredCalculator.execution.Calculator;
import refactoredCalculator.execution.Validator;
import refactoredCalculator.read.ConsoleInputReader;
import refactoredCalculator.read.Reader;

import java.io.Console;
import java.util.Scanner;

public class Prompter {
    private boolean loop;
    private ConsoleInputReader reader;
    private Validator validator;
    private Calculator calculator;

    public Prompter(){
        loop = true;
        this.calculator = new Calculator();
    }
    public void executePrompter(){
        while (loop) {
            System.out.println("enter number, operation and a second number");
            //Read the line that the user will type
            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();
            calculator.getTask(input);
            System.out.println("The answer is " + calculator.getAnswer());
            //Parse the expression and determine whether to continue prompting or not
            loop = validator.checkIfGoodInput(input);
        }
        //Free all resources used by Scanner class
    }

}
