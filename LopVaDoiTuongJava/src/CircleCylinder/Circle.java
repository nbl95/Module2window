package CircleCylinder;

public class Circle {
    public double radius;
    public String color;
    public double area;

    public Circle() {
        this.radius = 1;
        this.color = "blue";
        this.area = Math.pow(this.radius, 2) * Math.PI;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
        this.area = Math.pow(this.radius, 2) * Math.PI;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        this.area = Math.pow(this.radius, 2) * Math.PI;
        return this.area;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + this.radius +
                ", color='" + this.color + '\'' +
                ", area=" + this.area +
                '}';
    }
}