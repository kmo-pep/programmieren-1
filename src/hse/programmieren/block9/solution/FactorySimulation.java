package hse.programmieren.block9.solution;

import java.util.Scanner;

public class FactorySimulation {

    void main() {

        Vehicle vehicle = new Vehicle();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String command = scanner.nextLine();
            if (command.equals("exit")) {
                System.exit(0);
            } else if(command.equals("commandlist") || command.equals("help")) {
                System.out.println("exit, commandlist, help, vehiclelist, build");
            } else if (command.equals("build")) {
                build(scanner);
            }
        }

    }

    private static void build(Scanner scanner) {
        System.out.println("Preis?");
        String rawPrice = scanner.nextLine();
        try {
            double price = Double.parseDouble(rawPrice);
            while(price<=0) {
                System.out.println("Bitte positiven Preis eingeben");
                rawPrice = scanner.nextLine();
                price = Double.parseDouble(rawPrice);
            }
        } catch (NumberFormatException exception) {
            System.err.println("Bitte nur Zahlen eingeben");
        }

        System.out.println("Farbe?");
        final String rawColor = scanner.nextLine().toUpperCase();
        final Farbe color = Farbe.valueOf(rawColor);
        System.out.println("Model?");
        final String model = scanner.nextLine();
        System.out.println("Motor?");
        final String rawMotor = scanner.nextLine();
    }
}
