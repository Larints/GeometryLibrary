

public class Main {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 2, 3);
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(5, 5);
        System.out.println(triangle.getArea() + " " + triangle.getPerimeter());
        System.out.println(circle.getArea() + " " + circle.getCircumference());
        System.out.println(rectangle.getArea() + " " + rectangle.getPerimeter());
        System.out.println(triangle);
        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(GeometryUtils.compareAreas(triangle.getArea(), circle.getArea()));
        Cube cube = new Cube(10.0d);

    }

}
