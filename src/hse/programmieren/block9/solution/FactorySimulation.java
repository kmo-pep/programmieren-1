package hse.programmieren.block9.solution;

import java.util.Scanner;

public class FactorySimulation {

    void main() {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String command = scanner.nextLine();
            if (command.equals("exit")) {
                System.exit(0);
            } else if(command.equals("commandlist") || command.equals("help")) {
                System.out.println("exit, commandlist, help, vehiclelist, build");
            }
        }

    }
}
