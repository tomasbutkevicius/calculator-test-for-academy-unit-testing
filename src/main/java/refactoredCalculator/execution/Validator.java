package refactoredCalculator.execution;

public class Validator {
    private String input;

    public Validator() {
    }

    public Validator(String input) {
        this.input = input;
    }

    public boolean checkIfGoodInput(String input){
        //Trim the String from trailing whitespaces for comparisons
        input = input.trim();
        String[] expression = input.split(" ");
        //Check if the entered string was quit regardless of the case to end the program
        switch(expression.length){
            case 3:
                return true;
            default:
                System.out.println("Wrong input");
                break;
        }
        if(input.equalsIgnoreCase("quit")){
            return false;
        }
        return true;
    }
}
