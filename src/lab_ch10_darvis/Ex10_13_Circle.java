package lab_ch10_darvis;

public class Ex10_13_Circle extends Ex10_13_2DShape{
    private double radius;

    public Ex10_13_Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return String.format("Окружность\nРадиус = %s ", getRadius());
    }
}
