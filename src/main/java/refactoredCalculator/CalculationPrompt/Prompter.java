package refactoredCalculator.CalculationPrompt;

import refactoredCalculator.execution.Calculator;
import refactoredCalculator.execution.Validator;
import refactoredCalculator.execution.Values;
import refactoredCalculator.read.ConsoleInputReader;
import refactoredCalculator.read.Reader;

import java.io.Console;
import java.util.Scanner;

public class Prompter {
    private ConsoleInputReader reader;
    private Validator validator;
    private Calculator calculator;
    private Values values;

    public Prompter(ConsoleInputReader reader, Validator validator, Calculator calculator, Values values) {
        this.reader = reader;
        this.validator = validator;
        this.calculator = calculator;
        this.values = values;
    }

    public void executePrompter(){
        Boolean askForTask = true;
        Scanner scan = new Scanner(System.in);
        while (askForTask) {
            System.out.println("enter number, operation and a second number");
            //Read the line that the user will
            if(validator.checkIfGoodInput()){
                values = new Values(validator.getInput());
                System.out.println("The answer is " + calculator.getAnswer(values));
            }
            //Parse the expression and determine whether to continue prompting or not
            askForTask = validator.checkIfGoodInput();
        }
        //Free all resources used by Scanner class
    }

}
