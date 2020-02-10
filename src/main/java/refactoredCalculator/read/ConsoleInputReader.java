package refactoredCalculator.read;

import java.util.Scanner;

public class ConsoleInputReader implements Reader {

    @Override
    public String read() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }


}