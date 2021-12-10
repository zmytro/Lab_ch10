package lab_ch10_darvis;

public class Ex10_13_Sphere extends Ex10_13_3DShape {
    private double radius;

    public Ex10_13_Sphere(double radius) {
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
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getVolume() {
        return 4 * Math.PI * Math.pow(radius, 3) / 3;
    }

    @Override
    public String toString() {
        return String.format("%s: %n%s = %.2f", "Sphere", "radius", getRadius());
    }
}
