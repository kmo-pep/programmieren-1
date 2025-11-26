package hse.programmieren.block7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CatchExceptions {

    static void main() {
        Scanner scanner = new Scanner(System.in);

        try {
            final Number number = scanner.nextInt();
            System.out.println(number);
        } catch (InputMismatchException exception) {
            System.err.println("hey, nur Zahlen erlaubt!");
        }

    }
}
