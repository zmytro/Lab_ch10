package lab_ch10_darvis;

public class Ex10_13_Triangle extends Ex10_13_2DShape {
    private double base;
    private double height;

    public Ex10_13_Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return base * height / 2;
    }

    @Override
    public String toString() {
        return String.format("Треугольник\nОснование:%.2f\nВысота:%.2f", getBase(), getHeight());
    }
}
