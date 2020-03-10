
import java.awt.Color;

public abstract class Shape {

    protected String _name;
    protected Color _color;
    protected Boolean _isFilled;

    public Shape(String name, Color color) {
        _name = name;
        _color = color;
      
    }

    public abstract void paint();
}
