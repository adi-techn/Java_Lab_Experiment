class Animal {
    String name;
    int age;
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void eat() {
        System.out.println(name + " is eating.");
    }
 
    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}
class Mammal extends Animal {
    boolean hasFur;
 
    Mammal(String name, int age, boolean hasFur) {
        super(name, age);
        this.hasFur = hasFur;
    }
 
    void walk() {
        System.out.println(name + " is walking.");
    }
}
 
class Dog extends Mammal {
    String breed;
 
    Dog(String name, int age, boolean hasFur, String breed) {
        super(name, age, hasFur);
        this.breed = breed;
    }
 
    void bark() {
        System.out.println(name + " is barking.");
    }
 
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Has Fur: " + hasFur);
        System.out.println("Breed: " + breed);
    }
}
public class Que24 {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", 3, true, "Golden Retriever");
        myDog.displayDetails();
        myDog.eat();
        myDog.sleep();
        myDog.walk();
        myDog.bark();
    }
}
