class Shape {
    void about() {
        System.out.println("Normal shape.");
    }
}
class Circle extends Shape {
    @Override
    void about() {
        System.out.println("Circle");
    }
}
public class Que31{
    public static void main(String[] args) {
        Shape shape= new Circle();
        shape.about();
    }
}