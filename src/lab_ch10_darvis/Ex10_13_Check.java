package lab_ch10_darvis;

public class Ex10_13_Check {
    public static void main(String[] args) {
        Ex10_13_Shape[] shapes = new Ex10_13_Shape[6];
        shapes[0] = new Ex10_13_Circle(5.85);
        shapes[1] = new Ex10_13_Square(14);
        shapes[2] = new Ex10_13_Triangle(3, 7);
        shapes[3] = new Ex10_13_Circle(6);
        shapes[4] = new Ex10_13_Cube(15);
        shapes[5] = new Ex10_13_Tetrahedron(3);

        for (Ex10_13_Shape shape : shapes) {
            System.out.println(shape);

            if (shape instanceof Ex10_13_2DShape) {
                Ex10_13_2DShape twoDimensionalShape = (Ex10_13_2DShape) shape;
                System.out.printf("Площадь = %.2f%n%n", twoDimensionalShape.getArea());
            } else {
                Ex10_13_3DShape threeDimensionalShape = (Ex10_13_3DShape) shape;
                System.out.printf("Площадь = %.2f%n", threeDimensionalShape.getArea());
                System.out.printf("Объём = %.2f%n%n", threeDimensionalShape.getVolume());
            }
        }
    }

}
