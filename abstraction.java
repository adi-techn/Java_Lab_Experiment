public class abstraction{
     public static void main(String[] args) {
         Horse h=new Horse();
         h.eat();
         h.walk();
         // h.changeColor();
         
         Bird b=new Bird();
         b.eat();
         b.walk();
     }
 }
 
 abstract class Animal{
     String color;
 
     Animal(){
         color="Brown";
     }
     void eat(){
         System.out.println("Eats anything");
     }
 
     abstract void walk();
 }
 
 class Horse extends Animal{
     void changeColor(){
         color="White";
     }
     void walk(){
         System.out.println("walks on 4 leg");
     }
 }
 
 class Bird extends Animal{
     void walk(){
         System.out.println("Walks on 2 leg ");
     }
 }