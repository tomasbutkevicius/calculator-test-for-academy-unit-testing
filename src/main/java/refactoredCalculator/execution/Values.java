package refactoredCalculator.execution;

public class Values {
    private String input;
    private char operation;
    private Double firstOperator;
    private Double secondOperator;
    private Validator validator;

    public Values() {
    }

    public Values(String input, char operation, Double firstOperator, Double secondOperator, Validator validator) {
        this.input = input;
        this.operation = operation;
        this.firstOperator = firstOperator;
        this.secondOperator = secondOperator;
        this.validator = validator;
    }

    public void parseExpressionToValues(String input){
        //Trim the String from trailing whitespaces for comparisons
        if(validator.checkIfGoodInput(input)){
            try {
                input = input.trim();
                String[] expression = input.split(" ");
                this.firstOperator = Double.parseDouble(expression[0]);
                //Arithmetic operation
                this.operation = expression[1].charAt(0);
                //Operand 2
                this.secondOperator = Double.parseDouble(expression[2]);
            } catch (Exception e) {
                System.out.println("Invalid Input");
            }
        }
        else {
            System.out.println("Wrong input");
        }
    }

    public char getOperation() {
        return operation;
    }

    public Double getFirstOperator() {
        return firstOperator;
    }

    public Double getSecondOperator() {
        return secondOperator;
    }
}
