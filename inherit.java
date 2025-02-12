public class inherit {
     public static void main(String[] args) {
          grandChild gc=new grandChild();
     }
}
//Que1
class LibraryItem{
     int library_item;
     public void item(){
          System.out.println("Book,DVD,Journal");
     }
}
class Book extends LibraryItem{
     public void item_name(){
          System.err.println("Book");
          System.err.println(library_item);
     }
}
class DVD extends LibraryItem{
     public void item_name(){
          System.err.println("DVD");
          System.err.println(library_item);
     }
}
class Journal extends LibraryItem{
     public void item_name(){
          System.err.println("Journal");
          System.err.println(library_item);
     }
}
//Que2
class vehical{
     String model;
     int yr;
     void show(){
          System.out.println("Model"+model);
          System.out.println("Year"+yr);
     }
}
class car extends vehical{
     int numDoors;
     String fuelType;
     void showCar(){
          System.out.println("Doors:"+numDoors);
          System.out.println("Fuel:"+fuelType);
     }
}
//Que3
class Animals{
     String color;
     int legs;
 
     void eats(){
         System.out.println("eats");
     }
     void sleep(){
         System.out.println("sleep");
     }
}
class Mammal extends Animals{
     void birth(){
         System.out.println("Give birth");
     }
}
class Dog extends Mammal {
     void walks(){
         System.out.println("Walk");
     }
}
//Que5
class Base{
     Base(int x){
          System.out.println(x);
     }
     Base(){
          System.out.println("Base Class Constructor without parameter");
     }
}
class Derived extends Base{
     Derived(){
          System.out.println("Derived class constructor");
     }
     Derived(int x){
          super(x);
          System.out.println("Derived class constructor");
     }
}
//Que6
class parent{
     parent(){
          System.out.println("Base class constructor");
     }
}
class child extends parent{
     child(){
          System.out.println("Child class constructor");
     }
}
class grandChild extends child{
     grandChild(){
          System.out.println("Grand-child class constructor");
     }
}