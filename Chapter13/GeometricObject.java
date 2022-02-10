package Chapter13;

abstract class GeometricObject {
    private String color = "black";
    private boolean filled;

    protected GeometricObject() {

    }

    protected GeometricObject(String color) {
        this.color = color;
    }

    protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFill(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return this.color;
    }

    @Override
    public String toString() {
        return "color: " + this.color + "\nfilled: " + this.filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

}