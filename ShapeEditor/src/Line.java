
import java.awt.Color;
import java.awt.geom.Point2D;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kauro
 */
public class Line extends Shape {

    private Point2D _start;
    private Point2D _end;

    public Line(String name, Color color, Point2D start, Point2D end) {
        super(name, color);
        _start = start;
        _end = end;
    }

    @Override
    public void paint() {

    }
}
