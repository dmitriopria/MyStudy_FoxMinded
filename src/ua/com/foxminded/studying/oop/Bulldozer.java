package ua.com.foxminded.studying.oop;

public class Bulldozer implements Serviceable {

    String name;
    int yearOfProduction;
    int price;
    int weight;
    Color color;
    protected int distance = 0;
    private int distanceFromNew = 0;

    public Bulldozer(String name, int yearOfProduction, int price, int weight, Color color) {
        this.name = name;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public void addDistance(int additionalDistance) {
        distance += additionalDistance;
        distanceFromNew += additionalDistance;
    }

    @Override
    public void addDistance(double additionalDistance) {
        distance += Math.round(additionalDistance);
        distanceFromNew += Math.round(additionalDistance);
    }

    @Override
    public int getDistance() {
        return distance;
    }

    @Override
    public int getDistanceFromNew() {
        return distanceFromNew;
    }

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

    @Override
    public String toString() {
        return "Bulldozer [name=" + name + ", yearOfProduction=" + yearOfProduction + ", price=" + price + ", weight="
                + weight + ", color=" + color + ", distance=" + distance + ", distanceFromNew=" + distanceFromNew + "]";
    }

}
