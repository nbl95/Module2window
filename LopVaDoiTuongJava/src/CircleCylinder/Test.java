package CircleCylinder;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(16,"black");
        System.out.println(circle.toString());
        Cylinder cylinder = new Cylinder(18,"blue",15);
        System.out.println(cylinder.toString());
    }
}