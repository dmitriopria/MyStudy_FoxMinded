package ua.com.foxminded.studying.oop;

public class PassengerCar extends Car {

    public PassengerCar(String name, int yearOfProduction, int price, int weight, Color color) {
        super(name, yearOfProduction, price, weight, color);
        // TODO Auto-generated constructor stub
    }

    public PassengerCar() {}

    @Override
    public boolean isReadyToService() {
        if (distance > 10000) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public int toDoService() {
        return distance = 0;
    }

}
