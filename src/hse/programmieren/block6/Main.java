package hse.programmieren.block6;

import hse.programmieren.block6.task.CombustionCar;
import hse.programmieren.block6.task.ElectricCar;
import hse.programmieren.block6.task.Vehicle;

public class Main {

    static void main() {

        CombustionCar car = new CombustionCar(100, 80);
        Vehicle electricCar = new ElectricCar(100, 80);
//        Vehicle car2 = new Vehicle(100, 80);

        electricCar.drive();
        System.out.println(electricCar);

    }

}
