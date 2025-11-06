package hse.programmieren.block4.aufgaben;

import java.util.*;

public class Task {

    static void main() {

    }

    // Array
    public static void printEverySecondCar() {
        // 10 cars
        String[] vehicles = {"BMW", "Audi", "VW", "Mercedes", "Seat", "Skoda", "Ford", "Tesla", "Fiat", "Porsche"};


    }

    // ArrayList
    public static void printReversedCars() {
        // 10 cars
        ArrayList<String> vehicles = new ArrayList<>();
        vehicles.add("BMW");
        vehicles.add("Audi");
        vehicles.add("VW");
        vehicles.add("Mercedes");
        vehicles.add("Seat");
        vehicles.add("Skoda");
        vehicles.add("Ford");
        vehicles.add("Tesla");
        vehicles.add("Fiat");
        vehicles.add("Porsche");
    }

    // Iterator
    public static void printAndDeleteCars() {
        // 10 cars
        ListIterator<String> vehicles = new ArrayList<String>().listIterator();
        vehicles.add("BMW");
        vehicles.add("Audi");
        vehicles.add("VW");
        vehicles.add("Mercedes");
        vehicles.add("Seat");
        vehicles.add("Skoda");
        vehicles.add("Ford");
        vehicles.add("Tesla");
        vehicles.add("Fiat");
        vehicles.add("Porsche");


    }

    // HashMap
    public static void printMostExpensiveCar() {
        // 10 cars
        HashMap<String, Integer> vehicles = new HashMap<>();
        vehicles.put("BMW", 40_000);
        vehicles.put("Audi", 44_000);
        vehicles.put("VW", 41_000);
        vehicles.put("Mercedes", 49_000);
        vehicles.put("Seat", 35_000);
        vehicles.put("Skoda", 35_000);
        vehicles.put("Ford", 33_000);
        vehicles.put("Tesla", 60_000);
        vehicles.put("Fiat", 10_000);
        vehicles.put("Porsche", 99_000);
    }

    // HashSet
    public static void printDistinctCars() {
        // 10 cars
        HashSet<String> vehicles = new HashSet<>();
        vehicles.add("BMW");
        vehicles.add("BMW");
        vehicles.add("VW");
        vehicles.add("Mercedes");
        vehicles.add("Seat");
        vehicles.add("Skoda");
        vehicles.add("Ford");
        vehicles.add("Tesla");
        vehicles.add("Fiat");
        vehicles.add("Fiat");
    }
}
