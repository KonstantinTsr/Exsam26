public class Triangle {
    public double SideA;
    public double SideB;
    public double SideC;

    public Triangle(double sideA, double sideB, double sideC) throws IllegalTriangleException {
        if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA) {
            throw new IllegalTriangleException("Invalid triangle sides: the sum of any two sides must be greater than the third side.");
        }

        SideA = sideA;
        SideB = sideB;
        SideC = sideC;
    }

    public String toString() {
        return "Triangle with sides: " + SideA + ", " + SideB + ", " + SideC;
    }
}
