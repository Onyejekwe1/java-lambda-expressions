interface Shape {
    void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle implements draw");
    }
}

class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle implements Draw");
    }
}

class Triangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Triangle implements draw");
    }
}
public class LambdaExample {

    public static void main(String[] args){
//        Shape circle = () -> System.out.println("Circle implements draw");
//        circle.draw();
//
//        Shape rectangle = () -> System.out.println("Rectangle implements draw");
//        rectangle.draw();
//
//        Shape triangle = () -> System.out.println("Triangle implements draw");
//        triangle.draw();

        print(() -> System.out.println("Triangle implements draw"));
        print(() -> System.out.println("Rectangle implements draw"));
        print(() -> System.out.println("Circle implements draw"));
    }

    private static void print(Shape shape){
        shape.draw();
    }

}

