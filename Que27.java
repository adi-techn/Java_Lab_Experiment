import java.util.Scanner;
class Box{
    double width, height, depth;
    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    double volume(){
        return width * height * depth;
    }
}
class BoxWeight extends Box {
    double weight;
    BoxWeight(double width, double height, double depth, double weight) {
        super(width, height, depth);
        this.weight = weight;
    }
    double shippingCost(double distance, double costPerKm) {
        return distance*volume()*costPerKm;
    }
}
public class Que27{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Width of the box: ");
        double width = sc.nextDouble();
        System.out.print("Height of the box: ");
        double height = sc.nextDouble();
        System.out.print("Depth of the box: ");
        double depth = sc.nextDouble();
        System.out.print("Weight of the box: ");
        double weight = sc.nextDouble();
        System.out.print("Distance in km: ");
        double distance = sc.nextDouble();
        System.out.print("Cost per km: ");
        double costPerKm = sc.nextDouble();

        BoxWeight box = new BoxWeight(width, height, depth, weight);

        double boxVolume = box.volume();
        double shippingCost = box.shippingCost(distance,costPerKm);

        System.out.printf("Volume:%2f\n",boxVolume);
        System.out.printf("Cost:%2f",shippingCost);
        sc.close();
    }
}
