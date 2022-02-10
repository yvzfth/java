package Chapter11;

public class GeometricObject {

    private String color = "black";
    private boolean isFilled = false;

    GeometricObject() {
        // initial constractor
    }

    GeometricObject(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    @Override
    public String toString() {
        return "\ncolor: " + color + "\nisFilled: " + isFilled;
    }
}