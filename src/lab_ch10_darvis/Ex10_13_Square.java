package lab_ch10_darvis;

public class Ex10_13_Square extends Ex10_13_2DShape {
    private double side;

    public Ex10_13_Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return String.format("Квадрат\nСторона квадрата: %.2f", getSide());
    }
}

