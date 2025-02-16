class Vehicle {
    String model;
    int year;

    Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }

    void displayInfo() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
}

class Car extends Vehicle {
    int numDoors;
    String fuelType;

    Car(String model, int year, int numDoors, String fuelType) {
        super(model, year);
        this.numDoors = numDoors;
        this.fuelType = fuelType;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numDoors + ", Fuel Type: " + fuelType);
    }
}

public class Que22{
    public static void main(String[] args) {
        Car myCar = new Car("Toyota Corolla", 2020, 4, "Petrol");
        myCar.displayInfo();
    }
}
