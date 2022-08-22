package ua.com.foxminded.studying.oop;

public interface Serviceable {

    public void addDistance(int additionalDistance);

    public void addDistance(double additionalDistance);

    public int getDistance();

    public int getDistanceFromNew();

    public boolean isReadyToService();

    public int toDoService();

}
