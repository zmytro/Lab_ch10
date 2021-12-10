package lab_ch10_darvis;

public class Ex10_13_Tetrahedron extends Ex10_13_3DShape {
    private double edge;

    public Ex10_13_Tetrahedron(double edge) {
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    @Override
    public double getArea() {
        return Math.pow(edge, 2) * Math.sqrt(3);
    }

    @Override
    public double getVolume() {
        return 1.0 / 12 * Math.sqrt(2) * Math.pow(edge, 3);
    }

    @Override
    public String toString() {
        return String.format("Пирамидка\nРебро:%.2f", getEdge());
    }
}
