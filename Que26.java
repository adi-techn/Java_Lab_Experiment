class Animal {
    Animal() {
        System.out.println("Animal constructor called");
    }
}
 
class Mammal extends Animal {
    Mammal() {
        super();
        System.out.println("Mammal constructor called");
    }
} 
class Dog extends Mammal {
    Dog() {
         super();
        System.out.println("Dog constructor called");
    }
}
 
public class Que26{
    public static void main(String[] args) {
        Dog dog = new Dog();
    }
}
 
