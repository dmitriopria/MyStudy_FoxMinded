package ua.com.foxminded.studying.oop;

import java.util.ArrayList;
import java.util.List;

public class CarManager {

    public static void main(String[] args) {

        Car prius = new PassengerCar ();		// для примера оставил разные способы создания машины
        prius.name = "Toyota Prius";			// и вообще, так будет правильнее делать
        prius.color = Color.GREEN;
        prius.yearOfProduction = 2008;			// просто хочу, чтобы такой ввод данных остался, как пример
        prius.price = 15000;
        prius.weight = 1200;

        Car renault1 = new Bus ("Renault Laguna", 2000, 9700, 1600, Color.WHITE);

        Motorcycle suzuki = new Motorcycle("Suzuki GSX-R1000", 2021, 16000, 600, " black", "diesel", true);

        Motorcycle yamaha = new Motorcycle("Yamaha  FZ1", 2007, 9000, 700, "orangE ", "gas", false);

        System.out.println(prius);
        System.out.println(renault1);
        System.out.println(suzuki);
        System.out.println(yamaha);

        Car renault2 = new PassengerCar ("Renault Laguna", 2000, 9700, 1600, Color.WHITE);
        System.out.println(renault1.equals(renault2));		// тут false, потому что они объявлены из разных классов
        System.out.println(renault1.equals(prius));

        System.out.println(suzuki.equals(yamaha));

        prius.addDistance(1000);
        prius.addDistance(2000);
        System.out.println(prius);

        yamaha.addDistance(250000);
        suzuki.addDistance(250000);
        yamaha.destroyEngine();
        suzuki.destroyEngine();
        System.out.println(yamaha);
        System.out.println(suzuki);
        yamaha.repair(true);
        suzuki.repair(true);
        yamaha.setColor(Color.BLACK);
        System.out.println(yamaha);
        System.out.println(suzuki);

        prius.addDistance(20.5);
        System.out.println(prius);

        suzuki.addDistance(11.5f);
        yamaha.addDistance(-11.5f);
        System.out.println(yamaha);
        System.out.println(suzuki);

        prius.addDistance(15000);
        renault1.addDistance(15000);
        System.out.println(prius.isReadyToService());
        System.out.println(renault1.isReadyToService());

        prius.toDoService();				// я тут немного поигрался, чтобы сделав сервис, сбился пробег
        renault1.toDoService();
        System.out.println(prius);
        System.out.println(renault1);

        prius.addDistance(2000);			// но, при этом сохранился начальный пробег
        System.out.println(prius);

        Bulldozer bulldozer = new Bulldozer("JAVA", 2022, 1, 1000, Color.ORANGE);		// поигрался
        bulldozer.addDistance(22.8);
        bulldozer.addDistance(10000);
        System.out.println(bulldozer);
        System.out.println(bulldozer.isReadyToService());
        bulldozer.toDoService();
        bulldozer.addDistance(22.8);
        System.out.println(bulldozer);

        List<Car> cars = new ArrayList<>();
        cars.add(prius);
        cars.add(renault1);
        cars.add(renault2);
        System.out.println(cars);

        List<Motorcycle> motorcycles = new ArrayList<>();
        motorcycles.add(suzuki);
        motorcycles.add(yamaha);
        System.out.println(motorcycles);

    }

}
