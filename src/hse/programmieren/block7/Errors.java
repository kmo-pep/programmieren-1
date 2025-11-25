package hse.programmieren.block7;

import hse.programmieren.block6.solution.Audi;

public class Errors {

    static void main() {
        example11();
    }

    static void example1() {
        String[] array = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K"};

        for (int index = 0; index < 10; index++) {
            String value = array[index];
            System.out.println(value);
        }
    }

    static void example2() {
        String[] array = {"A", "B", "C", "D", "E", "F", "G", "H"};

        for (int index = 0; index < 10; index += 2) {
            String value = array[index];
            System.out.println(value);
        }
    }

    static void example3() {
        int value1 = 1;
        int value2 = 2;

        int result = value1 / value2;
        System.out.println(result);
    }

    static void example4() {
        double value1 = 1;
        double value2 = 0;

        double result = value1/value2;
        System.out.println(result);
    }

    static void example5() {
        boolean isDextral = false;
        int counter = 0;

        while(isDextral) {
            counter++;
            if(counter == 10) {
                isDextral=true;
            }
        }
    }

    static void example6() {
        char first = 'A';
        char second = 'B';

        System.out.println(first + second);
    }

    static void example7() {
        Audi audi = new Audi();

        audi.add(200);
        audi.drive();
        audi.drive();
        audi.drive();
        audi.drive();
        audi.drive();
        audi.drive();
        audi.drive();
        audi.drive();
        audi.drive();
        audi.drive();
        audi.drive();
        audi.drive();
        audi.drive();

        System.out.println(audi.getFuelLevel());
        System.out.println(audi.getEnergyLevel());
    }

    static void example8() {
        String password = new String("geheim123");
        String input = new String("geheim123");

        if (input == password) {
            System.out.println("Login erfolgreich");
        } else {
            System.out.println("Falsches Passwort");
        }
    }

    static void example9() {
        String firstName = null;
        String lastName = "null";

        if (firstName.equals(null)) {
            System.out.println("first name shouldn't be null, please enter a name");
        }
    }

    static void example10() {
        int[] array = new int[5];
        array[1] = 2;
        array[2] = 2;
        array[3] = 2;
        int division = 32;

        for (int i : array) {
            division /= i;
        }

        System.out.println(division);
    }

    static void example11() {
        int reservations = 3;

        System.out.println("Nur noch: " + reservations--);
        System.out.println("Nur noch: " + reservations--);
        System.out.println("Nur noch: " + reservations--);
    }

}
