import com.BTL.Point;
import com.BTL.Shape.Circle;

public class Main {
    public static void main(String[] args) {
        Point O = new Point(2, 3);
        Circle c = new Circle(O, 3);
        System.out.println(c.getPerimeter());
        System.out.println(O);
    }
}
