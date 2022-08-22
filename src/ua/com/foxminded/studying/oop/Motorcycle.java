package ua.com.foxminded.studying.oop;

public class Motorcycle {

    String name;
    int yearOfProduction;
    int price;
    int weight;
    Color color;
    String engineType;
    boolean isReadyToDrive;
    private int distance = 0;

    public Motorcycle(String name, int yearOfProduction, int price, int weight, String color, String engineType,
                      boolean isReadyToDrive) {
        this.name = name;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.weight = weight;			// color = color.toUpperCase(); and color = color.replace(" ", "");
        this.color = Color.valueOf(color.toUpperCase().replace(" ", ""));						// in row
        this.engineType = engineType;
        this.isReadyToDrive = isReadyToDrive;
    }

    public void addDistance(int additionalDistance) {
        distance += additionalDistance;
    }

    public void addDistance(float additionalDistance) {
        distance += Math.round(additionalDistance);
    }

    public boolean isReadyToService() {
        if (distance > 8000) {
            return true;
        }
        else {
            return false;
        }
    }

    public int getDistance() {
        return distance;
    }

    public boolean repair (boolean repairResult) {
        return isReadyToDrive = repairResult;
    }

    public boolean destroyEngine () {
        if (this.distance >= 200000) {
            isReadyToDrive = false;
        }
        return isReadyToDrive;
    }

    public Color setColor (Color newColor) {
        this.color = newColor;
        return color;
    }

    @Override
    public String toString() {
        return "Motorcycle [name=" + name + ", yearOfProduction=" + yearOfProduction + ", price=" + price + ", weight="
                + weight + ", color=" + color + ", engineType=" + engineType + ", isReadyToDrive=" + isReadyToDrive
                + ", distance=" + distance + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + (isReadyToDrive ? 1231 : 1237);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Motorcycle other = (Motorcycle) obj;
        if (color != other.color)
            return false;
        if (isReadyToDrive != other.isReadyToDrive)
            return false;
        return true;
    };

}
