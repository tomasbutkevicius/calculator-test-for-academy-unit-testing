package refactoredCalculator.execution;

import refactoredCalculator.read.Reader;

public class Validator {
    private String input;
    private Values values;
    private Reader reader;

    public Validator(Reader reader, Values values) {
        this.reader = reader;
        this.values = values;
    }

    public String getInput() {
        return input;
    }
    public boolean checkIfGoodInput() {
        //Trim the String from trailing whitespaces for comparisons
        String input = reader.read();
        values = new Values(input);
        input = input.trim();
        if (input.equalsIgnoreCase("quit")) {
            return false;
        } else {
            try {
                String[] expression = input.split(" ");
                if (expression.length != 3) {
                    System.out.println("Invalid Input");
                } else {
                    return values.parseExpressionToValues();
                }
            } catch (Exception e) {
                System.out.println("Invalid input");
                return false;
            }
        }
        return values.parseExpressionToValues();
    }

}