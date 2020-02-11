package refactoredCalculator.execution;

public class Values {
    private String input;
    private char operation;
    private Double firstOperator;
    private Double secondOperator;
    private Validator validator;

    public Values() {
    }

    public Values(String input) {
        this.input = input;
    }

    public boolean parseExpressionToValues(){
        //Trim the String from trailing whitespaces for comparisons
            try {
                input = input.trim();
                String[] expression = input.split(" ");
                this.firstOperator = Double.parseDouble(expression[0]);
                //Arithmetic operation
                this.operation = expression[1].charAt(0);
                //Operand 2
                this.secondOperator = Double.parseDouble(expression[2]);
                return true;
            } catch (Exception e) {
                System.out.println("Invalid Input");
                return false;
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
