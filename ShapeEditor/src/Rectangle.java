
import java.awt.Color;
import java.awt.geom.Point2D;

public class Rectangle extends Shape {

    private Point2D _topLeft;
    private double _width;
    private double _height;

    public Rectangle(String name, Color color, Point2D topLeft, double width, double height) {
        super(name, color);
        _topLeft = topLeft;
        _width = width;
        _height = height;
    }

    @Override
    public void paint() {

    }
}
