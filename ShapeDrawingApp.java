/*Create a class structure for a Shape Drawing Application. Start with an abstract class Shape with a method 
draw(). Derive two classes: Circle and Rectangle. Implement the draw() method in both derived classes to 
display specific messages such as “Drawing a Circle” and “Drawing a Rectangle”. In the main program, create
 an array of Shape objects (including both circles and rectangles) and call the draw() method on each. 
Demonstrate polymorphism through this array. */
abstract class Shape {
    public abstract void draw();
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}
public class ShapeDrawingApp {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
