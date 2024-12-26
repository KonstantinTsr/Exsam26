import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Circle> circles = new ArrayList<Circle>();
        circles.add(new Circle(12));
        circles.add(new Circle(42));
        circles.add(new Circle(22.12));
        circles.add(new Circle(67.9));
        circles.add(new Circle(9.12));

        Circle maxCircle = Collections.max(circles);

        System.out.println("Наибольший радиус: " + maxCircle.radius);
    }
}
