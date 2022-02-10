public class CreateObject {
    public static void main(String[] args) {
        Circle newCircle = new Circle();
        System.out.println(newCircle.newString);
    }

}

class Circle {

    double radius;
    String newString = "sadasfa";

    Circle() {

    }

    Circle(double newradius) {
        radius = newradius;
    }
}