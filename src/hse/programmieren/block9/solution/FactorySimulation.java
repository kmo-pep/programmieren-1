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
            } else if (command.equals("commandlist") || command.equals("help")) {
                System.out.println("exit, commandlist, help, vehiclelist, build");
            } else if (command.equals("build")) {
                build(scanner);
            }
        }

    }

    private static void build(Scanner scanner) {
        System.out.println("Preis?");
        final double price = readPrice(scanner);
        System.out.println("Farbe?");
        final String rawColor = scanner.nextLine().toUpperCase();
        final Farbe color = Farbe.valueOf(rawColor);
        System.out.println("Model?");
        final String model = scanner.nextLine();
        System.out.println("Motor?");
        final String rawMotor = scanner.nextLine();
    }

    public static double readPrice(Scanner scanner) {
        try {
            String rawPrice = scanner.nextLine();
            double price = Double.parseDouble(rawPrice);

            if (price <= 0) {
                return readPrice(scanner);
            }

            return price;
        } catch (NumberFormatException exception) {
            return readPrice(scanner);
        }

    }
}
