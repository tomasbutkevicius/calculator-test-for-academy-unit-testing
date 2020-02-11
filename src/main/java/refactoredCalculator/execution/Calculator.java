package refactoredCalculator.execution;

public class Calculator {
    private String input;
    private char operation;
    private Double firstOperator;
    private Double secondOperator;
    private Double answer;
    private Values values;

    public Calculator() {
    }

    public Calculator(String input, char operation, Double firstOperator, Double secondOperator, Double answer, Values values) {
        this.input = input;
        this.operation = operation;
        this.firstOperator = firstOperator;
        this.secondOperator = secondOperator;
        this.answer = answer;
        this.values = values;
    }
    private void getTask(Values values){
            this.firstOperator = values.getFirstOperator();
            this.secondOperator = values.getSecondOperator();
            this.operation = values.getOperation();
    }

    public Double getAnswer(Values values) {
            getTask(values);
            switch (operation) {
                case '+':
                    answer = firstOperator + secondOperator;
                    break;
                case '-':
                    answer = firstOperator - secondOperator;
                    break;
                case '*':
                    answer =  firstOperator * secondOperator;
                    break;
                case '/':
                    answer = firstOperator / secondOperator;
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
            return answer;
        }

    }
