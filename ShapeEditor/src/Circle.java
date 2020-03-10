
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
public class Circle extends Shape {

    private Point2D _center;
    private double _radius;

    public Circle(String name, Color color , Point2D center , double radius) {
        super(name, color);
        _center = center;
        _radius = radius;
    }

    @Override
    public void paint() {

    }
}
