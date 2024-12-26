import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Circle implements Comparable<Circle> {
    public double radius;
    public int go;
    public Circle(double radius) {
        this.radius = radius;
    }
//dasdasdsadasdasdsada
    @Override
    public int compareTo(Circle o) {
        return Double.compare(this.radius, o.radius);
    }
}
