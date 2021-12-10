package lab_ch10_darvis;

public class Ex10_13_Cube extends Ex10_13_3DShape {
    private double side;

    public Ex10_13_Cube(double side) {
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
        return 6 * Math.pow(side, 2);
    }

    @Override
    public double getVolume() {
        return Math.pow(side, 3);
    }

    @Override
    public String toString() {
        return String.format("Куб\nРазмер куба: %.2f", getSide());
    }
}
