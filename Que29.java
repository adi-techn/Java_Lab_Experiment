import java.util.Scanner;
class Shape{
    public void find_Area(){
        return;
    }
}
class Square extends Shape{
    int side;
    Square(int side){
        this.side = side;
    }
    @Override
    public void find_Area(){
        System.out.println("Area of Square: "+(side*side));
    }
}
class Rectangle extends Shape{
    int length, breadth;
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    public void find_Area() {
        System.out.println("Area of Rectangle: "+(length*breadth));
    }
}
public class Que29{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter side of square: ");
        int side = sc.nextInt();
        Square sq= new Square(side);
        System.out.print("Enter length of rectangle: ");
        int length = sc.nextInt();
        System.out.print("Enter breadth of rectangle: ");
        int breadth = sc.nextInt();
        Rectangle rect= new Rectangle(length, breadth);
        sq.find_Area();
        rect.find_Area();
        sc.close();
    }
}