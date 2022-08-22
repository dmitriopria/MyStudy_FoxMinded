package ua.com.foxminded.studying.oop;

public enum Color {

    WHITE("White"), BLACK("Black"), GREEN("Green"), BLUE("Blue"), ORANGE("Orange"), YELLOW("Yellow"),;

    String color;
    Color(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public String toString() {
        return getColor();
    }

}